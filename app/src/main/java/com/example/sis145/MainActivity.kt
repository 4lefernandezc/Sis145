package com.example.sis145

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonInvitado = findViewById<Button>(R.id.buttonInvitado) as Button

        ButtonInvitado.setOnClickListener(){
            val intent = Intent(this , MainMenuActivity::class.java)
            startActivity(intent)
        }
    }
}