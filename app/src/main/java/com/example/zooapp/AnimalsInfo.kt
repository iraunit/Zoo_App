package com.example.zooapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.BundleCompat
import org.w3c.dom.Text
import java.util.concurrent.TimeoutException

class AnimalsInfo : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
        const val DESC="description_extra"
        const val IMAGE="image_extra"
    }
    var image= intent.getStringExtra(AnimalsInfo.IMAGE)!!.toInt()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals_info)

        var name=intent.getStringExtra(Name_Extra)
        var des=intent.getStringExtra(DESC)
//        var image= intent.getIntExtra(IMAGE).toInt()

        var infoname=findViewById<TextView>(R.id.detailName)
        infoname.setText(name)
        val desInfo=findViewById<TextView>(R.id.detailDescription)
        desInfo.setText(des)
        val InfoImage=findViewById<ImageView>(image)
        InfoImage.setImageResource((image))
    }


}

