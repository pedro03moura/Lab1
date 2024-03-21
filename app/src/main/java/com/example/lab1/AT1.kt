package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.databinding.ActivityAt1Binding

class AT1 : AppCompatActivity() {

    private lateinit var binding: ActivityAt1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAt1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSair.setOnClickListener {
            finishAffinity()
        }
    }
}