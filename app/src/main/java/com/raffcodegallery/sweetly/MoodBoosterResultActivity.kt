package com.raffcodegallery.sweetly

import android.content.Intent
import android.net.Uri
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
        var query = ytQuery.text.toString()
        var tautan = "https://www.youtube.com/results?search_query=" + query

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
        } else if (kondisi == "Sedih") {
            prompt2.text = "Hei kamu lagi sedih? Sini aku kasih puk-puk online buat " + nama + "... * puk-puk *. Cause everything gonna be all right, semoga sedihmu segera berganti dengan rasa senang ya!"
        } else if (kondisi == "Insecure") {
            prompt2.text = nama + " , aku tau.. pasti rasanya insecure itu gaenak ya. Yang kamu rasain itu normal, tapi kamu jangan terlarut begitu lama yaa.. cmon, you're worthy."
        } else {
            prompt2.text = "Uuuuu, apa yang bikin " + nama + " takut?? Mana orangnya kasih tau aku biar aku hajar. Atau ada sesuatu terjadi padamu? Ayo hadapi, kamu hebat, aku percayakan semuanya kepadamu."
        }

        button.setOnClickListener {
//            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(tautan)))
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(tautan)
            )
            val chooseIntent = Intent.createChooser(intent, "Choose from below")
            startActivity(chooseIntent)
        }

    }
}


//package com.raffcodegallery.sweetly
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//import org.w3c.dom.Text
//
//class MoodBoosterResultActivity : AppCompatActivity() {
//
//    private lateinit var textUserName : TextView
//    private lateinit var textPassword : TextView
//    private lateinit var txt : TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_mood_booster_result)
//
//        textUserName = findViewById(R.id.tv_username)
//        textPassword = findViewById(R.id.tv_password)
//        txt = findViewById(R.id.tv_passwordd)
//
//        val userName = intent.getStringExtra("nama")
//        val password = intent.getStringExtra("opsi")
//        val text = intent.getStringExtra("skala")
//
//        textUserName.text = "Username : "+userName
//        textPassword.text = "Password : "+password
//        txt.text = "Tes: " + text
//
//    }
//}