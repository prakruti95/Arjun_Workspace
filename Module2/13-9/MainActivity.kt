package com.example.newexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var list:MutableList<String>
    lateinit var searchView: SearchView


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.list)
        list =ArrayList()
        searchView=findViewById(R.id.search)

        list.add("Android")
        list.add("Java")
        list.add("Php")
        list.add("Ios")


        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
        listView.adapter=adapter

        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean
            {
                /*if(list.contains(p0))
                {
                    adapter.filter.filter(p0)
                }
*/
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {

                adapter.filter.filter(p0)

                return true
            }
        })

    }


}