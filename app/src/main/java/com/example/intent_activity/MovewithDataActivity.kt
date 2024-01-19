package com.example.intent_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MovewithDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movewith_data_acitivity)

        val tvDataRecieved: TextView =
            findViewById(R.id.tv_data_received)
        val name = intent.getStringExtra(EXTRA_NAME)
        val  Age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "Name : $name, Your Age : $Age"
        tvDataRecieved.text= text
    }
    companion object{
        const val EXTRA_AGE="extra_age"
        const val EXTRA_NAME="extra_name"
    }
}