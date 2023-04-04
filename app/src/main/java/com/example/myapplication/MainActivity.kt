package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
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
            val weight = weightText.text.toString()
            val height = heightText.text.toString()
            val bmi = (weight.toFloat())/(((height.toFloat())/100)*
                    (height.toFloat()/100))
            val bmi2digits = String.format("%.2f", bmi).toFloat()
             displayResult(bmi2digits)
        }

    }
    private fun displayResult(bmi:Float)
    {
        val resultIndex = findViewById<TextView>(R.id.tvindex)
        val resultDescription = findViewById<TextView>(R.id.tvresult)
        val info = findViewById<TextView>(R.id.tvrange)


        resultIndex.text = bmi.toString()
        info.text = "Normal range is 18.5-24.9"
        var resultText = ""
        var color = 0
        when {
            bmi<18.5 ->
            {
                resultText = "Underweight"
                color = R.color.underweight
            }
            bmi in 18.5..24.99 ->
            {
                resultText = "Healthy"
                color = R.color.normal
            }
            bmi in 25.0..29.99 ->
            {
                resultText = "Overweight"
                color = R.color.overweight
            }
            bmi>29.99 ->
            {
                resultText = "Obese"
                color = R.color.obese
            }

        }

        resultDescription.setTextColor(ContextCompat.getColor(this, color))
        resultDescription.text = resultText

    }
}