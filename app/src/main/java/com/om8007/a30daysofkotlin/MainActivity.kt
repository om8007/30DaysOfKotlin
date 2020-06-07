package com.om8007.a30daysofkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoogleRes.setOnClickListener(){
            intent = Intent(this, GoogleResActivity::class.java)
            startActivity(intent)
        }

        buttonOtherRes.setOnClickListener(){
            intent = Intent(this, OtherResActivity::class.java)
            startActivity(intent)
        }
    }
}
