package com.om8007.a30daysofkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_google_res.*

class GoogleResActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_google_res)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        googleRecyclerView.layoutManager = layoutManager

        val adapter = GoogleResAdapter(this, Supplier.codelabs)
        googleRecyclerView.adapter = adapter
    }
}