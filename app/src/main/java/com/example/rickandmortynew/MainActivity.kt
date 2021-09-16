package com.example.rickandmortynew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuButtonCharacters = findViewById<Button>(R.id.buttonCharacters)

        menuButtonCharacters.setOnClickListener {
            val intent = Intent(this@MainActivity, CharacterSpisok::class.java)
            startActivity(intent)
        }
    }
}