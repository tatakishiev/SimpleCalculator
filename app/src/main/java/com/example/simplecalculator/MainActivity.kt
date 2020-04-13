package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View)  {
        val a: Int = number1.text.toString().toInt()
        val b: Int = number2.text.toString().toInt()

        resultTextView.text = "Result is ${a + b}"
    }

    fun subtract(view: View) {
        val a: Int = number1.text.toString().toInt()
        val b: Int = number2.text.toString().toInt()

        resultTextView.text = "Result is ${a - b}"
    }
}