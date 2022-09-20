package com.raffcodegallery.sweetly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_music_zone.*

class MusicZone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_zone)

        kembali.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }
    }
}