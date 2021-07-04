package com.example.androidbootcampodev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OdevActivity1 : AppCompatActivity() {
    lateinit var getStarted : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odev1)
        getStarted = findViewById(R.id.getStarted)

        
        getStarted.setOnClickListener {
            
            val intent = Intent(this@OdevActivity1,OdevActivity2::class.java)
            startActivity(intent)
        }
        
    }
}