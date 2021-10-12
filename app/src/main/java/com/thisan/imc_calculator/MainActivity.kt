package com.thisan.imc_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcButton : Button = findViewById(R.id.calc_button)
        calcButton.setOnClickListener { calcular() }

    }

    private fun calcular(){
        val resultText: TextView = findViewById(R.id.result_text)
        val height : EditText = findViewById(R.id.height)
        val weight : EditText = findViewById(R.id.weight)

        var h = height.text.toString().toFloat() / 100
        var w = weight.text.toString().toFloat()
        var res = w/(h*h)

       resultText.text = "%.2f".format(res)


    }
}