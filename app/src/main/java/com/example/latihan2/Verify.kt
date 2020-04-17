package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verify : AppCompatActivity() {

    private lateinit var Home1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        Home1 = findViewById(R.id.btnsend)
        Home1.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
