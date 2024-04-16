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

        val intentName = intent.getStringExtra("name");
        val intentProfession = intent.getStringExtra("profession")
        val intentCompany = intent.getStringExtra("company")

        val textViewName = findViewById<TextView>(R.id.textViewName);
        val textViewProfession = findViewById<TextView>(R.id.textViewProfession);
        val textViewCompany = findViewById<TextView>(R.id.textViewSociete);

        textViewName.text = "Nom : $intentName";
        textViewProfession.text = "Profession : $intentProfession";
        textViewCompany.text = "Société : $intentCompany";

        val submitButton = findViewById<Button>(R.id.submitButton);
        submitButton.setOnClickListener {
            val nom = textViewName.getText().toString();
            val profession = textViewProfession.getText().toString();
            val company = textViewCompany.getText().toString();

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("name", nom)
            intent.putExtra("profession", profession)
            intent.putExtra("company", company)
            startActivity(intent)
        }
    }
}