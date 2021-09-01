// 4. A Very Big Sum - HackerRank :  https://www.hackerrank.com/challenges/a-very-big-sum/problem

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var sum :Long = 0
    for (i in ar.indices){
        sum += ar[i]
    }
    return sum
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
