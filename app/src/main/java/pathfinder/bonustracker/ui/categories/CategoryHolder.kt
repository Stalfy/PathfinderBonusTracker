package pathfinder.bonustracker.ui.categories

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.categories_recycler_view_item_row.view.*

class CategoryHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    private var view: View = v
    private var text: String? = null

    init {
        v.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        Log.d("RecyclerView", CATEGORY_KEY)
        this.view.category_description.text = "I was clicked :D"
    }

    fun bindCategory(text: String) {
        this.text = text
        this.view.category_description.text = text
    }

    companion object {
        private const val CATEGORY_KEY = "CATEGORY"
    }
}