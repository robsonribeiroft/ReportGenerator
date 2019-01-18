package com.rrdev

import java.util.*

object Main {

    private val tasks = listOf("""Task_1""",
            """Task_2""",
            """Task_3""",
            """Task_4""",
            """Task_5""",
            """Task_6""")

    @JvmStatic
    fun main(args: Array<String>) {
        val startDay = Calendar.getInstance()
        startDay[Calendar.DAY_OF_MONTH] = 2
        startDay[Calendar.MONTH] = 9
        startDay[Calendar.YEAR] = 2018

        val finalDay = Calendar.getInstance()
        finalDay[Calendar.DAY_OF_MONTH] = 1
        finalDay[Calendar.MONTH] = 0
        finalDay[Calendar.YEAR] = 2019

        var randomTask: String
        while (startDay.time.before(finalDay.time)){
            randomTask = tasks[(0 until tasks.size).random()]
            startDay.add(Calendar.DAY_OF_MONTH, 1)
            println("${startDay.formatOnPattern()},${if (startDay.isWeekend()) "FDS" else randomTask}")
        }

    }
}
