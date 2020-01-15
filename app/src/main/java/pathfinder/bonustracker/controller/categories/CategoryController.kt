package pathfinder.bonustracker.controller.categories

import pathfinder.bonustracker.ui.categories.CategoryAdapter

class CategoryController {
    fun addCategory(adapter: CategoryAdapter, text: String) {
        adapter.categories.add(text)
    }
}