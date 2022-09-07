package com.example.myapplication17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()
{

    lateinit var edt1:EditText
    lateinit var edt2:EditText
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1=findViewById(R.id.edt1)
        edt2=findViewById(R.id.edt2)
        btn1=findViewById(R.id.btn1)

        btn1.setOnClickListener {

            var num = edt1.text.toString()
            var pass = edt2.text.toString()

            if(num.length==0 && pass.length==0)
            {
                edt1.setError("Please Enter Proper Number")
                edt2.setError("Please Enter Proper Password")
            }
            else if(num.length==0)
            {
                edt1.setError("Please Enter Proper Number")
            }
            else if(pass.length==0)
            {
                edt2.setError("Please Enter Proper Password")
            }
            else
            {
                if(num.equals("1234") && pass.equals("arjun"))
                {
                    Toast.makeText(applicationContext,"Login Success",Toast.LENGTH_LONG).show()

                    var i =Intent(this,MainActivity2::class.java)
                    startActivity(i)

                }
                else
                {
                    Toast.makeText(applicationContext,"Login Fail",Toast.LENGTH_LONG).show()
                }


            }


        }

    }
}