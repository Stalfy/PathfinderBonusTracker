package pathfinder.bonustracker.ui.categories

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pathfinder.bonustracker.R
import pathfinder.bonustracker.controller.categories.CategoryController
import kotlin.random.Random

class CategoriesFragment : Fragment() {

    private lateinit var categoriesViewModel: CategoriesViewModel
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var categoryController: CategoryController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_categories, container, false)

        attachTextViewObservers(root)
        initializeRecyclerView(root)

        categoryController = CategoryController()

        categoriesViewModel.text.value = getString(R.string.text_categories_fragment)

        return root
    }

    override fun onResume() {
        super.onResume()
        Log.d(Log.DEBUG.toString(), "OnResumeFired.")
        categoryController.addCategory(categoryAdapter, "A")
        categoryController.addCategory(categoryAdapter, "B")
        categoryController.addCategory(categoryAdapter, "C")
        categoryAdapter.notifyItemInserted(categoryAdapter.itemCount - 1)
    }

    private fun attachTextViewObservers(root: View) {
        categoriesViewModel = ViewModelProviders.of(this).get(CategoriesViewModel::class.java)

        val textView: TextView = root.findViewById(R.id.text_view_categories)

        categoriesViewModel.text.observe(this, Observer {
            textView.text = it
        })
    }

    private fun initializeRecyclerView(root: View) {
        val recyclerView: RecyclerView = root.findViewById(R.id.recycler_view_categories)

        categoryAdapter = CategoryAdapter(ArrayList())

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = categoryAdapter
    }
}