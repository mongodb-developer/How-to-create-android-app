package com.mongodb.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val displayText = findViewById<TextView>(R.id.textView)
            displayText.text = "Hello ${editText.text}"
        }
    }

}