package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightText = findViewById<EditText>(R.id.et_weight)
        val heightText = findViewById<EditText>(R.id.et_height)
        val btnCalc = findViewById<Button>(R.id.btn_calculate)

        btnCalc.setOnClickListener {
            val weight = weightText.text.toString()
            val height = heightText.text.toString()

            val bmi = weight.toFloat()/((height.toFloat()/100)*(height.toFloat()/100))
            // get result with 2 decimal places
            val bmi2Digits = String.format("%.2f", bmi).toFloat()
            displayResult(bmi2Digits)
        }
    }

    private fun displayResult(bmi:Float) {
        Toast.makeText(this, "Your BMI is: " + bmi.toString(), Toast.LENGTH_LONG).show();
    }
}