package com.example.zooapp

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.nio.file.Files.delete

class  AnimalAdapter(context:Context, listAnimal:ArrayList<Animal>) : BaseAdapter() {
    var animalList=listAnimal
    var context=context
    override fun getCount(): Int {
        return animalList.size
    }

    override fun getItem(position: Int): Any {
        return animalList.toString()
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val animalView:View
        animalView=LayoutInflater.from(context).inflate(R.layout.animal_ticket,null)
        val name=animalView.findViewById<TextView>(R.id.name)
        val description=animalView.findViewById<TextView>(R.id.description)
        val photo=animalView.findViewById<ImageView>(R.id.imageView2)
        val resource=context.resources.getIdentifier(animalList[position].image.toString(),"drawable",context.packageName)
        photo.setOnClickListener {
//            var delete=MainActivity()
//           delete.delete(position)
            val intent=Intent(context,AnimalsInfo::class.java)
            intent.putExtra(AnimalsInfo.Name_Extra, animalList[position].name)
            intent.putExtra(AnimalsInfo.DESC,animalList[position].description)
            intent.putExtra(AnimalsInfo.IMAGE,resource)
            context.startActivity(intent)
        }
              name.setText(animalList[position].name)
        description.setText(animalList[position].description)
        photo.setImageResource(resource)
        return animalView
    }



}