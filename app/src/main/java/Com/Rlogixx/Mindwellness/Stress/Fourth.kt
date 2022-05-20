package Com.Rlogixx.Mindwellness.Stress

import Com.Rlogixx.Mindwellness.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fourth:Fragment(R.layout.fragment_fourth) {

    private var count=0
    var score=0
    var low=0
    private var next=0
    var new=0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text=view.findViewById<TextView>(R.id.textView)
        val button=view.findViewById<Button>(R.id.button2)
        val button2=view.findViewById<Button>(R.id.button3)


        button.setOnClickListener {
            count++
            score++
            if(count==1)
            {
                text.text="Felling down,Depressed , or hopeless ? "

            }
            if(count==2)
            {
                text.text="Touble Falling or staying asleep too much ?"

            }
            if(count==3)
            {
                text.text="Felling tired or having little energy ?"


            }
            if (count==4)
            {
                text.text="poor Apepetite or overeating ?"


            }
            if (count==5){
                text.text="felling bad about yourself or or that you are a failure or have let yourself or your family down ?"

            }
            if (score>3)
            {
                findNavController().navigate(R.id.action_fourth_to_yes)
            }

        }


        button2.setOnClickListener {
            next++
            new++
            if (next==1){
                text.text="Moving or speaking so slowly that other could have noticed ?"
            }
            if (next==2){
                text.text="Does life seem pointless ?"
            }
            if(next==3){
                text.text="Does it seem like it’s impossible to concentrate?"
            }
            if (next==4){
                text.text="thoughts that you would be better of dead ,or hurting yourself in some other way ?"
            }
            if (next==5){
                text.text="Have you noticed a sudden change in your weight?"
            }
            if (new==4){
                findNavController().navigate(R.id.action_fourth_to_no)
            }
        }
    }

}