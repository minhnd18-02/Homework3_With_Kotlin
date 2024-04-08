package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var ButtonComputers : Button
    private lateinit var listPhones : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        ButtonComputers = findViewById(R.id.btn_Computers);
        ButtonComputers.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent);
        }

        listPhones = findViewById(R.id.listView2)
        var namesOfPhone = arrayListOf("IPHONE 15", "IPHONE 15 PRO MAX", "IPHONE 15 PRO",
            "SAMSUNG GALAXY S22", "SAMSUNG GALAXY S22 ULTRA")
//        var arrayAdapter : ArrayAdapter<String> = ArrayAdapter(
//            this, android.R.layout.simple_list_item_1, namesOfPhone
//        )
//
//        listPhones.adapter = arrayAdapter
//        listPhones.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this, "Item Selected " + namesOfPhone[position], Toast.LENGTH_LONG)
//                .show()
//        }

        val adapter = CustomAdapter(this, namesOfPhone)
        listPhones.adapter = adapter
    }
}