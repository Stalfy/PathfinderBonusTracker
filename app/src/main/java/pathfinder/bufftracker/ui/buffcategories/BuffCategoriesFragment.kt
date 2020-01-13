package pathfinder.bufftracker.ui.buffcategories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pathfinder.bufftracker.R

class BuffCategoriesFragment : Fragment() {

    private lateinit var buffCategoriesViewModel: BuffCategoriesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        buffCategoriesViewModel = ViewModelProviders.of(this).get(BuffCategoriesViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_buff_categories, container, false)
        val textView: TextView = root.findViewById(R.id.text_buff_categories)

        buffCategoriesViewModel.text.observe(this, Observer {
            textView.text = it
        })

        buffCategoriesViewModel.text.value = getString(R.string.text_buff_categories_fragment)

        return root
    }
}