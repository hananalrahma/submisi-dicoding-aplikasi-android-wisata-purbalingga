package com.hanan.wisatapurbalingga2

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)


        actionBar.setTitle(intent.getStringExtra("iName"))
        a_Name.text = intent.getStringExtra("iName")
        a_Detail.text = intent.getStringExtra("iDetail")
       imageView.setImageResource(intent.getIntExtra("iImg", 0))
    }
}