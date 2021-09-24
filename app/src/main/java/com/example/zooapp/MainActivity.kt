package com.example.zooapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter= AnimalAdapter(this,DataService.listOfAnimals)
        var AnimallView=findViewById<ListView>(R.id.AnimalView)
        AnimallView.adapter=adapter


    }


//    fun delete(index:Int){
//        DataService.listOfAnimals.removeAt(index)
//        adapter.notifyDataSetChanged()
//
//    }



    }
