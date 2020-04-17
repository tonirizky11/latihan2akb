package com.example.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent;

class MainActivity : AppCompatActivity() {

    private lateinit var register1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register1 = findViewById(R.id.textView2)
        register1.setOnClickListener{
            startActivity(Intent(this, register::class.java))
        }

    }
}
