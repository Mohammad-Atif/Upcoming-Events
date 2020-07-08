package com.example.upcomingevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_activity.*

class edit_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_activity)
        var v_serial=0
        val edit_views=getSharedPreferences("act1",0)
        if(!checkifnull(edit_views)){

            datefordelete.text="- - - -"
            msgfordelete.text="- - - -"
        }
        if(checkifnull(edit_views))
        {
            v_serial=forward(edit_views,v_serial)
        }
        datefordelete.text=edit_views.getString(dateserials[v_serial],"none")
        msgfordelete.text=edit_views.getString(dateserials[v_serial+1],"none")


        nexteditbtn.setOnClickListener {
            if(!checkifnull(edit_views))
            {
                Toast.makeText(this,"NO EVENTS TO DELETE", Toast.LENGTH_LONG).show()
            }
            else {
                v_serial = v_serial + 2
                datefordelete.text = edit_views.getString(dateserials[v_serial], "none")
                msgfordelete.text = edit_views.getString(dateserials[v_serial + 1], "none")
            }
        }

        deletebtn.setOnClickListener {
            if(!checkifnull(edit_views))
            {
                Toast.makeText(this,"NO EVENTS TO DELETE", Toast.LENGTH_LONG).show()
            }
            else {
                val deletor = edit_views.edit()
                deletor.remove(dateserials[v_serial])
                deletor.remove(dateserials[v_serial + 1])
                deletor.apply()
                deletor.commit()
                v_serial = v_serial + 2
                datefordelete.text = edit_views.getString(dateserials[v_serial], "none")
                msgfordelete.text = edit_views.getString(dateserials[v_serial + 1], "none")
                Toast.makeText(this, "EVENT DELETED", Toast.LENGTH_LONG).show()
            }
        }
    }
}
