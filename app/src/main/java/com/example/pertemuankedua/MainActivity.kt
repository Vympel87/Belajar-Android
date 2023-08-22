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
                Toast.makeText(this@MainActivity, "You push the button", Toast.LENGTH_SHORT).show()
            }
            btn2.setOnClickListener {
                Toast.makeText(this@MainActivity, "You push the button again", Toast.LENGTH_SHORT).show()
            }
        }
    }
}