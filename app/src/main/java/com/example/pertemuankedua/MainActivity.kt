package com.example.pertemuankedua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuankedua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btn1.setOnClickListener {
                var name = binding.inputTeks1.text.toString()
                var message = if (name.isNotEmpty()) "Hello $name!" else "You push the button"
                Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
//                Toast.makeText(this@MainActivity, "You push the button", Toast.LENGTH_SHORT).show()
            }
            btn2.setOnClickListener {
                var message = inputTeks2.editableText
                Toast.makeText(this@MainActivity, "Hello $message!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}