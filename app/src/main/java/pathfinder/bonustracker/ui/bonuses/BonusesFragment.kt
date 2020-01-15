package pathfinder.bonustracker.ui.bonuses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pathfinder.bonustracker.R

class BonusesFragment : Fragment() {

    private lateinit var buffListViewModel: BonusesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        buffListViewModel = ViewModelProviders.of(this).get(BonusesViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_bonuses, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)

        buffListViewModel.text.observe(this, Observer {
            textView.text = it
        })

        buffListViewModel.text.value = getString(R.string.text_buff_list_fragment)

        return root
    }
}