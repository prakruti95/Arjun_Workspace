package com.example.myapplication17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainActivity3 : AppCompatActivity(), RatingBar.OnRatingBarChangeListener {
    lateinit var rating:RatingBar

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        rating=findViewById(R.id.rating)

        rating.setOnRatingBarChangeListener(this)
    }

    override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean)
    {
        var ans =rating.rating

        Toast.makeText(applicationContext,""+ans,Toast.LENGTH_LONG).show()
    }


}