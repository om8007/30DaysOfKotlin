package com.om8007.a30daysofkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_other_res.*

class OtherResActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_other_res)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        otherRecyclerView.layoutManager = layoutManager

        val adapter = OtherResAdapter(this, OtherSupplier.codelabs)
        otherRecyclerView.adapter = adapter
    }
}