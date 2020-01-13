package pathfinder.bufftracker.ui.bonuses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pathfinder.bufftracker.R

class BonusesFragment : Fragment() {

    private lateinit var bonusesViewModel: BonusesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bonusesViewModel = ViewModelProviders.of(this).get(BonusesViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_bonuses, container, false)
        val textView: TextView = root.findViewById(R.id.text_bonuses)

        bonusesViewModel.text.observe(this, Observer {
            textView.text = it
        })

        bonusesViewModel.text.value = getString(R.string.text_bonuses_fragment)

        return root
    }
}