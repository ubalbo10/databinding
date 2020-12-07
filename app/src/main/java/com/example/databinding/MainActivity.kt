package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.databinding.PruebaEsBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    private lateinit var binding: PruebaEsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= PruebaEsBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        binding.textp.text="cambio";
        binding.button.setOnClickListener{
            Toast.makeText(this,"me presionaron",Toast.LENGTH_LONG).show()
        }

    }
}