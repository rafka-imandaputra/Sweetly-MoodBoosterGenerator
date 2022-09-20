package com.raffcodegallery.sweetly

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mood_booster_result.*

class MoodBoosterResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_booster_result)

        val nama = intent.getStringExtra("nama")
        val kondisi = intent.getStringExtra("opsi")
        val skalaHari = intent.getStringExtra("skala")

        haiNama.text = "Hai, " + nama

        if (skalaHari == "4" || skalaHari == "5") {
            prompt1.text = "Aku dengar hari kamu menyenangkan ya? Aaa glad to hear that."
        } else if (skalaHari == "3") {
            prompt1.text = "Harimu biasa-biasa aja ya? Don't worry ya, put smile on your face."
        } else {
            prompt1.text = "Hmm, lagi badmood ya? aku ikut sedih ngedengernya. Semoga situasimu lekas membaik."
        }

        if (kondisi == "Seneng"){
            prompt2.text = "Syukurlah kalau kamu lagi senang. Kuharap kamu jaga selalu situasi ini yaa. Tau gak, kondisi senang itu bisa bikin produktif loh, ayo lakukan aktivitas produktif yang kamu suka!"
        } else if (kondisi == "Bahagia") {
            prompt2.text = "Ciee kamu lagi bahagia nih, " + nama + " lagi bahagia karena apaa?? Apapun itu, aku ikut senang mendengarnya. Jangan lupa bersikap ramah pada orang lain yaa!"
        } else if (kondisi == "Bangga") {
            prompt2.text = "HUH HAH HUH HAH, congrats dari yang sudah kamu raih " + nama + " . Kamu bangga karena meraih sesuatu kan? Aaaaa keren. Mari apresiasikan dirimu, stay magical yaa!"
        } else if (kondisi == "Sedih     ") {
            prompt2.text = "Hei kamu lagi sedih? Sini aku kasih puk-puk online buat " + nama + "... * puk-puk *. Cause everything gonna be all right, semoga sedihmu segera berganti dengan rasa senang ya!"
        } else if (kondisi == "Sakit      ") {
            prompt2.text = "Hiks, " + nama + " lagi sakit ya... jangan lupa ihh dijaga asupan makannya biar tubuh kamu kuat ngelawan penyakit ehehe. Oh satu lagi, take a rest ya! Aku gasabar nunggu kabar sembuhnya kamu xixixi"
        } else {
            prompt2.text = "Uuuuu, apa yang bikin " + nama + " takut?? Mana orangnya kasih tau aku biar aku hajar. Atau ada sesuatu terjadi padamu? Ayo hadapi, kamu hebat, aku percayakan semuanya kepadamu."
        }

        button.setOnClickListener {
            startActivity(
                Intent(this,YoutubeActivity::class.java)
                    .putExtra("query", ytQuery.text.toString())
                    .putExtra("nama", intent.getStringExtra("nama"))
            )
        }

        kembali.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }
    }
}