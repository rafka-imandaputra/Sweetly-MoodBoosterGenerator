package com.raffcodegallery.sweetly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleLayout : AppCompatActivity() {

    private lateinit var newRecycelview : RecyclerView
    private lateinit var newArrayList: ArrayList<Item>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var text : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_layout)
        imageId = arrayOf(
            R.drawable.senang,
            R.drawable.sedih,
            R.drawable.takut,
            R.drawable.jijik,
            R.drawable.angry,
            R.drawable.kaget,
            R.drawable.malu,
            R.drawable.bangga,
            R.drawable.terhibur,
            R.drawable.salah,
            R.drawable.hina,
        )

        heading = arrayOf(
            "Kebahagiaan",
            "Kesedihan",
            "Ketakutan",
            "Jijik",
            "Marah",
            "Terkejut",
            "Malu",
            "Bangga",
            "Merasa Terhibur",
            "Merasa Bersalah",
            "Merasa Terhina",
        )

        text = arrayOf(
            "Perasaan puas, gembira, dan sejahtera.",
            "Perasaan kecewa, putus asa, tidak tertarik, dan suasana hati yang buruk.",
            "Menimbulkan respon untuk mempertahankan diri ketika ancaman muncul.",
            "Rasa tidak suka terhadap sesuatu sehingga berusaha menghindarinya.",
            "Perasaan frustrasi untuk melindungi diri dan merespons ancaman",
            "Kondisi yang terjadi sangat singkat akibat sesuatu yang tidak terduga.",
            "Perasaan yang membuat ga nyaman atau senang karena hal yang tidak diduga.",
            "Perasaan yang dapat meningkatkan rasa percaya diri dan apresiasi",
            "Perasaan yang dapat meningkatkan tingkat kesenangan diri.",
            "Perasaan tidak enak terhadap sesuatu yang membuat bingung.",
            "Merasa dikucilkan dan kehidupan menjadi tidak berguna.",
        )

        newRecycelview = findViewById(R.id.rView)
        newRecycelview.layoutManager = LinearLayoutManager(this)
        newRecycelview.setHasFixedSize(true)

        newArrayList = arrayListOf<Item>()
        getUserdata()
    }

    private fun getUserdata(){

        for (i in imageId.indices){
            val item = Item(imageId[i], heading[i], text[i])
            newArrayList.add(item)
        }

        newRecycelview.adapter = MyAdapter(newArrayList)

    }
}