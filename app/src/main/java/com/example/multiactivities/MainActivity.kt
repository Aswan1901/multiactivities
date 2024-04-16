package com.example.multiactivities
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    val inputName = findViewById<EditText>(R.id.nom);
    val inputProfession = findViewById<EditText>(R.id.profession);
    val inputCompany = findViewById<EditText>(R.id.societe);
    val submitButton = findViewById<Button>(R.id.submitButton);

        submitButton.setOnClickListener {
        val name = inputName.getText().toString();
        val profession = inputProfession.getText().toString();
        val company = inputCompany.getText().toString();

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("profession", profession)
        intent.putExtra("company", company)
        startActivity(intent)
        }
    }
}