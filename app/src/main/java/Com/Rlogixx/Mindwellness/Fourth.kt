package Com.Rlogixx.Mindwellness

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fourth:Fragment(R.layout.fragment_fourth) {

private var count=0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text=view.findViewById<TextView>(R.id.textView)
        val button=view.findViewById<Button>(R.id.button2)
        val burtton2=view.findViewById<Button>(R.id.button3)

    button.setOnClickListener {
        count++
        if (count==1)
        {
            text.text="Is you ARe Felling Depressed"
        }
        if (count==2)
        {
            text.text="Are you Felling cold"
        }
        if (count==3)
        {
            text.text="Disappointment at home, work, or school (in teens, this may be breaking up with a boyfriend or girlfriend, failing a class or parents divorcing)"
        }

        }

    }
}