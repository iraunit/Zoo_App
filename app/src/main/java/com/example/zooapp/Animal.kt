package com.example.zooapp

import android.media.Image
import android.widget.ImageView

class Animal {
    var name:String?=null
    var description:String?=null
    var image: Int?=null
//    var imagee:ImageView?=null
   public constructor(name:String,description:String, image:Int){
        this.name   =name
        this.description=description
        this.image=image

    }

//    override fun toString(): String {
//        return name.toString()
//    }
}