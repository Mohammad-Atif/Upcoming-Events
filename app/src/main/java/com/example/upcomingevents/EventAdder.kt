package com.example.upcomingevents

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_event_adder.*

class EventAdder : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_adder)
        val pref=getPreferences(Context.MODE_PRIVATE)

        var serials=pref.getInt(serialkey,0)

        addspecbtn.setOnClickListener {
            if(datetxt.text.toString()=="" || describetxt.text.toString()==""){
                Toast.makeText(this,"Enter proper info",Toast.LENGTH_LONG).show()

            }
            else
            {
                val editor=pref.edit()
                editor.putString(dateserials[serials],datetxt.text.toString())
                editor.putString(dateserials[serials+1],describetxt.text.toString())
                editor.putInt(serialkey,serials+2)
                editor.apply()
                editor.commit()
                serialno= serialno+2
                datetxt.text.clear()
                describetxt.text.clear()

                Toast.makeText(this,"EVENT SAVED",Toast.LENGTH_LONG).show()


            }
        }
    }
}
