package Com.Rlogixx.Mindwellness

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class SecondFrag:Fragment(R.layout.second_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val medic=view.findViewById<ImageView>(R.id.img_medic)
        val stress=view.findViewById<ImageView>(R.id.img_stress)

        medic.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondfrag_to_thirdFrag)
        }
        stress.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondfrag_to_fourth)
        }
    }
}