package com.raffcodegallery.sweetly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var et_user_name: TextView = findViewById(R.id.emailEt)
        var et_password: TextView = findViewById(R.id.passET)
        var btn_submit: Button = findViewById(R.id.button)

        btn_submit.setOnClickListener {
            val user_name = et_user_name.text.toString();
            val password = et_password.text.toString();
            if (user_name == "aku" && password == "senyum") {
                startActivity(Intent(this, MainActivity::class.java))
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}