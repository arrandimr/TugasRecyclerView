package com.example.tugasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecyclerview.Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users> ()
    val listBuah = arrayOf(
            "Semangka", "Anggur", "Pear", "Apel", "Jambu Merah", "Melon", "Alpukat"
    )

    val listHarga = arrayOf(
        "10.000", "15.000", "13.000", "15.000", "10.000", "8.000", "16.000"
    )

    val listGambar = arrayOf(
            R.drawable.semangka,
            R.drawable.anggur,
            R.drawable.pear,
            R.drawable.apel,
            R.drawable.jambu,
            R.drawable.melon,
            R.drawable.alpukat

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager (this)
        for (i in 0 until listBuah.size) {
            list.add(Users(listBuah.get(i), listHarga.get(i), listGambar.get(i)))
            if (listBuah.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}