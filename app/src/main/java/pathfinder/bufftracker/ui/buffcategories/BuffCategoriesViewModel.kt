package pathfinder.bufftracker.ui.buffcategories

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuffCategoriesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Default Buff Categories Fragment Text Value."
    }

    val text: MutableLiveData<String> = _text
}