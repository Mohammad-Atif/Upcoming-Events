package com.example.upcomingevents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_events_handling.*

class EventsHandlingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events_handling)
        updateserials()
        addbtn.setOnClickListener {
            val intent=Intent(this,EventAdder::class.java)
            startActivity(intent)
        }
    }
}
