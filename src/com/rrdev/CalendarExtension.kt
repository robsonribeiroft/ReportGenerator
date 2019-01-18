package com.rrdev

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formatOnPattern(pattern: String="dd/MM/yyyy"): String {
    val sdt = SimpleDateFormat(pattern)
    return sdt.format(this.time)
}

fun Calendar.isWeekend(): Boolean {
    return this[Calendar.DAY_OF_WEEK]==1 || this[Calendar.DAY_OF_WEEK]==7
}