package com.example.latihan2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Almost : AppCompatActivity() {
    private lateinit var Verif1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)

        Verif1 = findViewById(R.id.ver_btn_ver)
        Verif1.setOnClickListener {
            startActivity(Intent(this, Verify::class.java))
        }
    }
}


