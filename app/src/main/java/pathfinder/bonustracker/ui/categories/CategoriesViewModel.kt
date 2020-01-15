package pathfinder.bonustracker.ui.categories

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoriesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Default Buff Categories Fragment Text Value."
    }

    val text: MutableLiveData<String> = _text
}