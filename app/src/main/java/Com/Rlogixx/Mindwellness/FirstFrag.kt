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

        imageList.add(SlideModel(R.drawable.one," Meditation is not what you think"))
        imageList.add(SlideModel(R.drawable.two,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.three,"Brilliant things happen in calm minds"))
        imageList.add(SlideModel(R.drawable.four,"A day thinking about what could happen, should happen, or what might have been is a day missed"))
        imageList.add(SlideModel(R.drawable.ten,"Distractions are everywhere. Notice what takes your attention, acknowledge it, and then let it go"))
        imageList.add(SlideModel(R.drawable.twelve,"To know one's own mind is nothing short of life-changing"))
        imageList.add(SlideModel(R.drawable.fifteen,"Look up and smile. But only if you feel like it"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)



    }



    }

