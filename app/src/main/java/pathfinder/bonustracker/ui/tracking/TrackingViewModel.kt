package pathfinder.bonustracker.ui.tracking

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrackingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Default Bonuses Fragment Text Value."
    }

    val text: MutableLiveData<String> = _text
}