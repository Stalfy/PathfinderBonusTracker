package pathfinder.bonustracker.ui.tracking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pathfinder.bonustracker.R

class TrackingFragment : Fragment() {

    private lateinit var trackingViewModel: TrackingViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        trackingViewModel = ViewModelProviders.of(this).get(TrackingViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_tracking, container, false)
        val textView: TextView = root.findViewById(R.id.text_bonuses)

        trackingViewModel.text.observe(this, Observer {
            textView.text = it
        })

        trackingViewModel.text.value = getString(R.string.text_bonuses_fragment)

        return root
    }
}