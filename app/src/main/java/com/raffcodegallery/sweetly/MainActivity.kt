package com.raffcodegallery.sweetly

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mood: ImageView = findViewById(R.id.moodGen)
        var logout: Button = findViewById(R.id.button)
        firebaseAuth = FirebaseAuth.getInstance()

        logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, SignInActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        mood.setOnClickListener {
            startActivity(Intent(this, MoodBoosterFormActivity::class.java))
        }

        var birthday: ImageView = findViewById(R.id.birthGen)

        birthday.setOnClickListener {
            startActivity(Intent(this, BirthdayGenActivity::class.java))
        }

        var mood_level: ImageView = findViewById(R.id.moodLevel)

        mood_level.setOnClickListener {
            startActivity(Intent(this, RecycleLayout::class.java))
        }

        var about: ImageView = findViewById(R.id.about)

        about.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/raff_imanda")))
        }
    }
}