package com.example.sis145

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PlatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platos)

        val BtnSopa = findViewById<ImageButton>(R.id.imgBtnSopa) as ImageButton

        BtnSopa.setOnClickListener(){
            val intent = Intent(this , SopaActivity::class.java)
            startActivity(intent)
        }
    }

}