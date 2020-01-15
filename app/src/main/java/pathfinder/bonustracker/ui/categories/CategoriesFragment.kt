package pathfinder.bonustracker.ui.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pathfinder.bonustracker.R

class CategoriesFragment : Fragment() {

    private lateinit var categoriesViewModel: CategoriesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        categoriesViewModel = ViewModelProviders.of(this).get(CategoriesViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_categories, container, false)
        val textView: TextView = root.findViewById(R.id.text_buff_categories)

        categoriesViewModel.text.observe(this, Observer {
            textView.text = it
        })

        categoriesViewModel.text.value = getString(R.string.text_buff_categories_fragment)

        return root
    }
}