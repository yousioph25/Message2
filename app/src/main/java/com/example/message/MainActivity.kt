package com.example.message

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.text.method.LinkMovementMethod


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHyperlink()

        val button = findViewById<Button>(R.id.button)
        val editTextTextPersonName = findViewById<EditText>(R.id.editTextTextPersonName)
        val editTextTextPersonName2 = findViewById<EditText>(R.id.editTextTextPersonName2)


        button.setOnClickListener {

            val name = editTextTextPersonName.text.toString()
            val age = editTextTextPersonName2.text.toString();

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.NAME, name)
            intent.putExtra(SecondActivity.AGE, age)
            startActivity(intent)
        }

    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.activity_main_link)
        linkTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE)
    }
}