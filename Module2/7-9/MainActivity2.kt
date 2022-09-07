package com.example.myapplication17

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity()
{
    lateinit var img:ImageView
    lateinit var txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        img=findViewById(R.id.img1)
        txt=findViewById(R.id.txt1)

        img.setOnClickListener {

            var url="https://unsplash.com/s/photos/blue-t-shirt"
            var i =Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)

        }
        txt.setOnClickListener {

            Toast.makeText(applicationContext,"550",Toast.LENGTH_LONG).show()
        }
    }

    override fun onBackPressed()
    {

        var alert =AlertDialog.Builder(this)
        alert.setTitle("Are you sure you want to exit?")
        alert.setPositiveButton("YES",{
                dialogInterface: DialogInterface, i: Int ->

                finishAffinity()

        })
        alert.setNegativeButton("NO",{
                dialogInterface: DialogInterface, i: Int ->

            dialogInterface.cancel()

        })
        alert.show()
    }
}