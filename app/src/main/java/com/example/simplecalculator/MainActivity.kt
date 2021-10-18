package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var entNum1:EditText
    lateinit var entNum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMul:Button
    lateinit var btnDiv:Button
    lateinit var txt1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entNum1 = findViewById(R.id.entNum1)
        entNum2 = findViewById(R.id.entNum2)
        txt1 = findViewById(R.id.txt1)


        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)

        btnAdd.setOnClickListener {

            var rsult = entNum1.text.toString().toInt() + entNum2.text.toString().toInt()
            txt1.text="$rsult"
        }
        btnSub.setOnClickListener {
            var rsult = entNum1.text.toString().toInt() - entNum2.text.toString().toInt()
            txt1.text="$rsult"
        }
        btnMul.setOnClickListener {
            var rsult =  entNum1.text.toString().toInt() * entNum2.text.toString().toInt()
            txt1.text="$rsult"
        }
        btnDiv.setOnClickListener {
            var rsult =  entNum1.text.toString().toFloat() / entNum2.text.toString().toFloat()
            txt1.text="$rsult"
        }
    }
}