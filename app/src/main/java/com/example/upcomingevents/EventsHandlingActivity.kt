package com.example.upcomingevents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        viewbtn.setOnClickListener {
            val intentview=Intent(this,EventviewingActivity::class.java)
            startActivity(intentview)

        }
        editbtn.setOnClickListener {
            val p=getSharedPreferences("act1",0)
            val pedit=p.edit()
            pedit.clear()
            pedit.apply()
            pedit.commit()
            Toast.makeText(this,"EVENTS CLEARED", Toast.LENGTH_LONG).show()


        }
    }
}
