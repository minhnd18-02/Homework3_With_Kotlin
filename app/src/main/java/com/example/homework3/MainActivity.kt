package com.example.homework3

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var ButtonPhones : Button
    private lateinit var listComputers : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonPhones =  findViewById(R.id.btn_Phones)
        ButtonPhones.setOnClickListener{
            var Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent);
        }

        listComputers = findViewById(R.id.listView)
        var namesOfComputer =  arrayListOf("ACER NITRO 5", "ASUS ROG STRIX", "DELL INSPIRON",
                                        "MAC BOOK M1", "MAC BOOK AIR")
//        var arrayAdapter :  ArrayAdapter<String> = ArrayAdapter(
//            this, android.R.layout.simple_list_item_1, namesOfComputer
//        )
//
//        listComputers.adapter = arrayAdapter
////        listComputers.setOnItemClickListener { parent, view, position, id ->
////            Toast.makeText(this, "Item Selected " + namesOfComputer[position], Toast.LENGTH_LONG)
////                .show();
////        }

        val adapter = CustomAdapter(this, namesOfComputer)
        listComputers.adapter = adapter
    }
}