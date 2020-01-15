package pathfinder.bonustracker.ui.bonuses

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BonusesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Default Buff List Fragment Text Value."
    }

    val text: MutableLiveData<String> = _text
}