package com.example.upcomingevents

import android.content.SharedPreferences

const val serialkey="KEY"
var dateserials= arrayListOf<String>()
fun updateserials() {
    for (i in 1..2000) {
        dateserials.add("$i")
    }
}
fun checkifnull(v: SharedPreferences):Boolean{
    var flag=0
    for(j in 0..20){
        if(v.getString(dateserials[j],"none")!="none"){
            flag=1
        }
    }
    if(flag==1) {
        return true
    }
    return false
}

fun forward(a: SharedPreferences, b:Int):Int{
    var c=b
    while(a.getString(dateserials[c],"none")=="none"){
        c=c+2
    }
    return c

}

var serialno=0