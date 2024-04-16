package com.example.multiactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.activity.enableEdgeToEdge


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val displayName = intent.getStringExtra("name");
        val displayProfession = intent.getStringExtra("profession")
        val displaySociete = intent.getStringExtra("company")

        val name = findViewById<TextView>(R.id.textViewName);
        val profession = findViewById<TextView>(R.id.textViewProfession);
        val company = findViewById<TextView>(R.id.textViewSociete);

        name.text = "$displayName";
        profession.text = "$displayProfession";
        company.text = "$displaySociete";

        val submitButton = findViewById<Button>(R.id.submitButton);
        submitButton.setOnClickListener {
            val nom = name.getText().toString();
            val profession = profession.getText().toString();
            val company = company.getText().toString();

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("name", nom)
            intent.putExtra("profession", profession)
            intent.putExtra("company", company)
            startActivity(intent)
        }
    }
}