package com.example.upcomingevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_event_adder.*

class EventAdder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_adder)


        addspecbtn.setOnClickListener {
            if(datetxt.text.toString()=="" || describetxt.text.toString()==""){
                Toast.makeText(this,"Enter proper info",Toast.LENGTH_LONG).show()

            }
        }
    }
}
