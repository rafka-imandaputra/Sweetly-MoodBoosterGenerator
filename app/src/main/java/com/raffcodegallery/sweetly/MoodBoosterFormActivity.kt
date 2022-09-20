package com.raffcodegallery.sweetly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MoodBoosterFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_booster_form)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        val txtNama: TextView = findViewById(R.id.nama)
        val rg: RadioGroup = findViewById(R.id.RGroup)
        val spKelas: Spinner = findViewById(R.id.skala)
        var list_of_items = arrayOf("1","2","3", "4", "5")
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spKelas.setAdapter(aa)

        btnRoll.setOnClickListener {
            startActivity(
                Intent(this,MoodBoosterResultActivity::class.java)
                    .putExtra("nama",txtNama.text.toString())
                    .putExtra("opsi",findViewById<RadioButton>(rg.checkedRadioButtonId).text.toString())
                    .putExtra("skala",spKelas.selectedItem.toString())
            )
        }
    }
}
