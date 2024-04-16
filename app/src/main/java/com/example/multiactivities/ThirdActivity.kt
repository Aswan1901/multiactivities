package com.example.multiactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val name = intent.getStringExtra("name")
        val profession = intent.getStringExtra("profession")
        val company = intent.getStringExtra("company")


        findViewById<TextView>(R.id.NameBadge).text = name
        findViewById<TextView>(R.id.ProfessionBadge).text = profession
        findViewById<TextView>(R.id.CompanyBadge).text = company

        }
}
