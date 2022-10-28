package com.example.set

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class SettingsActivity : AppCompatActivity() {
    private lateinit var submit: AppCompatImageButton
    private lateinit var prev_btn:AppCompatImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        submit=findViewById(R.id.submit_btn)
        submit.setOnClickListener {
            makeText(applicationContext,"Succssfully Updated",Toast.LENGTH_SHORT).show()
        }

        prev_btn=findViewById(R.id.back_btn)
        prev_btn.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }
}