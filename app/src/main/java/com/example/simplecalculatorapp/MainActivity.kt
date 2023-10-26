package com.example.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var btnSubtract: Button
    private lateinit var btnSum: Button
    private lateinit var btnDivide: Button
    private lateinit var btnMultiplie: Button
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.editNumber1)
        secondNumber = findViewById(R.id.editNumber2)

        btnSubtract = findViewById(R.id.btnSub)
        btnSum = findViewById(R.id.btnSum)
        btnDivide = findViewById(R.id.btnDivide)
        btnMultiplie = findViewById(R.id.btnMultiplie)
        txtResult = findViewById(R.id.txtResult)

        btnSum.setOnClickListener{
            sum(firstNumber, secondNumber)
        }

        btnSubtract.setOnClickListener{
            subtract(firstNumber, secondNumber)
        }

        btnMultiplie.setOnClickListener{
            multiplie(firstNumber, secondNumber)
        }

        btnDivide.setOnClickListener{
            divide(firstNumber, secondNumber)
        }
    }

    fun sum(n1: EditText, n2: EditText) {
        var fN = firstNumber.text.toString()
        var sN = secondNumber.text.toString()

        var fNI = fN.toInt()
        var sNI = sN.toInt()

        txtResult.text = fNI.plus(sNI).toString()
    }

    fun subtract(n1: EditText, n2: EditText) {
        var fN = firstNumber.text.toString()
        var sN = secondNumber.text.toString()

        var fNI = fN.toInt()
        var sNI = sN.toInt()

        txtResult.text = fNI.minus(sNI).toString()
    }

    fun multiplie(n1: EditText, n2: EditText) {
        var fN = firstNumber.text.toString()
        var sN = secondNumber.text.toString()

        var fNI = fN.toInt()
        var sNI = sN.toInt()

        txtResult.text = fNI.times(sNI).toString()
    }

    fun divide(n1: EditText, n2: EditText) {
        var fN = firstNumber.text.toString()
        var sN = secondNumber.text.toString()

        var fNI = fN.toInt()
        var sNI = sN.toInt()

        txtResult.text = fNI.div(sNI).toString()
    }
}

