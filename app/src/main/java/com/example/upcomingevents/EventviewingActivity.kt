package com.example.upcomingevents

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eventviewing.*

class EventviewingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventviewing)
        var view_serial=0
        val events_views=getSharedPreferences("act1",0)
        date_view.text=events_views.getString(dateserials[view_serial],"none")
        event_desc_view.text=events_views.getString(dateserials[view_serial+1],"none")

        next_view_btn.setOnClickListener {
            view_serial=view_serial+2
            date_view.text=events_views.getString(dateserials[view_serial],"none")

            event_desc_view.text=events_views.getString(dateserials[view_serial+1],"none")


        }

    }
}
