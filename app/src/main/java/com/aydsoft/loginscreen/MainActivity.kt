package com.aydsoft.loginscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aydsoft.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val emailTxt = "yuta.aydemir@gmail.com"
        val passwordTxt = "123456"

        binding.btnLogin.setOnClickListener {
            if (binding.etEmail.text.isEmpty() || binding.etPassword.text.isEmpty()) {
                Toast.makeText(this, "Giriş bilgilerinizi eksiksiz giriniz", Toast.LENGTH_SHORT)
                    .show()
            } else {
                if (binding.etEmail.text.toString() == emailTxt && binding.etPassword.text.toString() == passwordTxt) {
                    val intent = Intent(this, HomePage::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Hatalı eposta veya şifre", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}