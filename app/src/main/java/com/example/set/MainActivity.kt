package com.example.set

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var btn : AppCompatImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn=findViewById(R.id.redirect)

        btn.setOnClickListener {
            val intent= Intent(this@MainActivity,SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}