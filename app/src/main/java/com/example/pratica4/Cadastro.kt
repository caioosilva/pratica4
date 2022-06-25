package com.example.pratica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cadastro:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        val button3 = findViewById<Button>(R.id.button2)
        button3.setOnClickListener {
            val intent = Intent(this, Lista::class.java)
            startActivity(intent)

        }
    }
}