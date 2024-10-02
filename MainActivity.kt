package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailField: EditText = findViewById(R.id.etEmail)
        val passwordField: EditText = findViewById(R.id.etPassword)
        val registerButton: Button = findViewById(R.id.btnRegister)

        registerButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Будь ласка, введіть усі дані", Toast.LENGTH_SHORT).show()
            } else {
                // Тут можна додати логіку для реєстрації користувача
                Toast.makeText(this, "Реєстрація успішна!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}