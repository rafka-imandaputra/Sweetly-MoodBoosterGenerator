package com.raffcodegallery.sweetly

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAuth = FirebaseAuth.getInstance()

        var logout: TextView = findViewById(R.id.kembali)
        logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, SignInActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        var mood: ImageView = findViewById(R.id.moodGen)
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

        var musicZone: ImageView = findViewById(R.id.musicZone)
        musicZone.setOnClickListener {
            startActivity(Intent(this, MusicZoneTemporary::class.java))
        }

        var about: TextView = findViewById(R.id.about)
        about.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/raff_imanda")))
        }
    }
}