package com.example.upcomingevents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(
                {
                    val intent=Intent(this,EventsHandlingActivity::class.java)
                    startActivity(intent)
                },2000
        )
    }
}
