package pathfinder.bonustracker.ui.categories

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pathfinder.bonustracker.R

class CategoryAdapter(val categories: ArrayList<String>) : RecyclerView.Adapter<CategoryHolder>() {
    fun addItem(text: String) {
        categories.add(text)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        Log.d(Log.DEBUG.toString(), "onBindViewHolder.")
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder.bindCategory(categories[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        Log.d(Log.DEBUG.toString(), "onCreateViewHolder.")
        val inflatedView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.categories_recycler_view_item_row, parent, false)

        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return CategoryHolder(inflatedView)
    }

    override fun getItemCount() = categories.size
}

