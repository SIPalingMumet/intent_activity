package com.example.intent_activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveWithdataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithdataActivity.setOnClickListener(this)
        val btnProfileActivity: Button = findViewById(R.id.btn_profile)
        btnProfileActivity.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_move_activity ->{
                 val moveIntent = Intent(this@MainActivity,
                     MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data ->{
                val movewithDataIntent = Intent(this@MainActivity,
                    MovewithDataActivity::class.java)
                movewithDataIntent.putExtra(MovewithDataActivity.EXTRA_NAME,
                    "DicodingAcademy Boy ")
                movewithDataIntent.putExtra(MovewithDataActivity.EXTRA_AGE, 5)
                startActivity(movewithDataIntent)
            }
            R.id.btn_dial_number ->{
                val phoneNumber="0876982134557"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.btn_profile->{
                val ProfileActivity = Intent(this@MainActivity,
                    ProfileActivity::class.java)
                startActivity(ProfileActivity)
            }

        }
    }
}