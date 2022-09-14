package com.raffcodegallery.sweetly

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.view.View.OnClickListener;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

        var about: ImageView = findViewById(R.id.about)

        about.setOnClickListener {
            startActivity(Intent(this, AboutDeveloperActivity::class.java))
        }

        var ig: ImageView = findViewById(R.id.ig_fol)

        ig.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/raff_imanda")))
        }
    }
}