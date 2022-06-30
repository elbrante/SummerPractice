package com.example.summerpractice2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val age  = findViewById<EditText>(R.id.age).text.toString().toInt()
            val height = findViewById<EditText>(R.id.height).text.toString().toInt()
            val weight = findViewById<EditText>(R.id.weight).text.toString().toFloat()
            val name = findViewById<EditText>(R.id.name).text.toString()
            var flag : Boolean = false
            if (age > 150 || age < 0) {
                Toast.makeText(this, "Укажите корректный возраст", Toast.LENGTH_SHORT).show()
                flag = true
            }
            if (height > 250 || height < 0) {
                Toast.makeText(this, "Укажите корректный рост", Toast.LENGTH_SHORT).show()
                flag = true
            }
            if (weight > 250 || weight < 0) {
                Toast.makeText(this, "Укажите корректный вес", Toast.LENGTH_SHORT).show()
                flag = true
            }
            if (name == "" || name.length > 50) {
                Toast.makeText(this, "Укажите корректный имя", Toast.LENGTH_SHORT).show()
                flag = true
            }
            if (!flag) {
                val view = findViewById<TextView>(R.id.out)
                var output = (age + weight + height + name.length).toInt().toString()
                view.text = "Ответ: $output тысяч.Это ваши недоплаченные нологи"
            }
        }



        }

    }
