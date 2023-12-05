package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var linkToCategory: TextView = findViewById(R.id.linkToCat)
        var linkToPeten: TextView = findViewById(R.id.linkToPeten)

        linkToPeten.setOnClickListener{
            val intent = Intent(this, article::class.java)
            startActivity(intent)
        }
        linkToCategory.setOnClickListener{
            val intent = Intent(this, peten::class.java)
            startActivity(intent)
        }
    }
}