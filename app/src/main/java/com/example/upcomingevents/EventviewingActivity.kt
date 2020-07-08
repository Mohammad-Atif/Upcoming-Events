package com.example.upcomingevents

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_eventviewing.*

class EventviewingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventviewing)
        var view_serial=0
        val events_views=getSharedPreferences("act1",0)
        if(!checkifnull(events_views)){

            date_view.text="- - - -"
            event_desc_view.text="- - - -"
        }
        if(checkifnull(events_views))
        {
            view_serial=forward(events_views,view_serial)
        }
        date_view.text=events_views.getString(dateserials[view_serial],"none")
        event_desc_view.text=events_views.getString(dateserials[view_serial+1],"none")


        next_view_btn.setOnClickListener {
            if(!checkifnull(events_views)){
                Toast.makeText(this,"NO EVENTS TO SHOW", Toast.LENGTH_LONG).show()
            }
            else {


                view_serial = view_serial + 2
                date_view.text = events_views.getString(dateserials[view_serial], "none")

                event_desc_view.text = events_views.getString(dateserials[view_serial + 1], "none")
            }


        }

    }

}
