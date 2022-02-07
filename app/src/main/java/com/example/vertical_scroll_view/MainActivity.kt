package com.example.vertical_scroll_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var image=findViewById<ImageView>(R.id.image)

        var im1=findViewById<ImageView>(R.id.img1)
        im1.setOnClickListener{
            image.setImageResource(R.drawable.food1)
        }

        var im2=findViewById<ImageView>(R.id.img2)
        im2.setOnClickListener{
            image.setImageResource(R.drawable.food2)
        }

        var im3=findViewById<ImageView>(R.id.img3)
        im3.setOnClickListener{
            image.setImageResource(R.drawable.food3)
        }

        var im4=findViewById<ImageView>(R.id.img4)
        im4.setOnClickListener{
            image.setImageResource(R.drawable.food4)
        }

        var im5=findViewById<ImageView>(R.id.img5)
        im5.setOnClickListener{
            image.setImageResource(R.drawable.food5)
        }

        var im6=findViewById<ImageView>(R.id.img6)
        im6.setOnClickListener{
            image.setImageResource(R.drawable.food6)
        }

        var im7=findViewById<ImageView>(R.id.img7)
        im7.setOnClickListener{
            image.setImageResource(R.drawable.food7)
        }

        var img8=findViewById<ImageView>(R.id.img8)
        img8.setOnClickListener {
            image.setImageResource(R.drawable.food8)
        }




    }
}