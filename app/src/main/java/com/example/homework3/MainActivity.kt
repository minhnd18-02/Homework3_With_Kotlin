package com.example.homework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var ButtonPhones : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonPhones =  findViewById(R.id.btn_Phones)
        ButtonPhones.setOnClickListener{
            var Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent);
        }
    }
}