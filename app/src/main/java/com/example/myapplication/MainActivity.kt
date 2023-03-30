package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //myTextView.text = "Hello World! \n Welcome to Cyprus International University"
        val weightText = findViewById<EditText>(R.id.etweight)
        val heightText = findViewById<EditText>(R.id.etheight)
        val btn = findViewById<Button>(R.id.calc)

        btn.setOnClickListener()
        {
            
        }


    }
}