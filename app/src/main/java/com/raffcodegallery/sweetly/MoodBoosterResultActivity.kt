package com.raffcodegallery.sweetly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MoodBoosterResultActivity : AppCompatActivity() {

    private lateinit var textUserName : TextView
    private lateinit var textPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_booster_result)

        textUserName = findViewById(R.id.tv_username)
        textPassword = findViewById(R.id.tv_password)

        val userName = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        textUserName.text = "Username : "+userName
        textPassword.text = "Password : "+password

    }
}