package Com.Rlogixx.Mindwellness

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FirstFrag:Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button=view.findViewById<FloatingActionButton>(R.id.button)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_firstfrag_to_secondfrag)
        }

        val imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.two,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.one,"You don’t have to control your thoughts. You just have to stop letting them control you"))
        imageList.add(SlideModel(R.drawable.three,"Self-care is how you take your power back"))
        imageList.add(SlideModel(R.drawable.four,"Your illness is not your identity. Your chemistry is not your character"))
        imageList.add(SlideModel(R.drawable.sixteen,"If you feel like life is sinking, try positive thinking!"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)



    }



    }

