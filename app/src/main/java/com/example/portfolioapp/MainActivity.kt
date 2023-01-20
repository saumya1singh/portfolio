package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val and var
        val buttonSkills= findViewById<Button>(R.id.btnSkills)

        buttonSkills.setOnClickListener {

            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
    }
}