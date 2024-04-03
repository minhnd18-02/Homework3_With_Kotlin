package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var ButtonComputers : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        ButtonComputers = findViewById(R.id.btn_Computers);
        ButtonComputers.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent);
        }

    }
}