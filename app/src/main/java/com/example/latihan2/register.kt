package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {

    private lateinit var kirim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        kirim = findViewById(R.id.kirim1)
        kirim.setOnClickListener {
            startActivity(Intent(this, Almost::class.java))

        }
    }
}

