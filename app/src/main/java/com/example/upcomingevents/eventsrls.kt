package com.example.upcomingevents
const val serialkey="KEY"
var dateserials= arrayListOf<String>()
fun updateserials() {
    for (i in 1..200) {
        dateserials.add("$i")
    }
}
var serialno=0