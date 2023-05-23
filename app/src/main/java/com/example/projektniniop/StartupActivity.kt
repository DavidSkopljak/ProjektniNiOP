package com.example.projektniniop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartupActivity : AppCompatActivity() {
    lateinit var buttonStartUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)
       buttonStartUp=findViewById(R.id.buttonStartUp)
        buttonStartUp.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}