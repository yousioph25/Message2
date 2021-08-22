package com.example.message

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    companion object {
        const val NAME = "NAME"
        const val AGE = "AGE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setupHyperlink()

        val textView5 = findViewById<TextView>(R.id.textView5)
        val textView6 = findViewById<TextView>(R.id.textView6)

        val name = intent.getStringExtra(NAME)
        val age = intent.getStringExtra(AGE)

        textView5.text = "Hi! "+name
        textView6.text = "Your Age is "+age

    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.activity_main_link)
        linkTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE)
    }
}