// 7. Arrays = Left Rotation  HackerRank https://www.hackerrank.com/challenges/array-left-rotation/problem

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun rotateLeft(d: Int, arr: Array<Int>): List<Int> {
    // Write your code here
    val list = arr.toList()
    Collections.rotate(list, -d)
    return list
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotateLeft(d, arr)

    println(result.joinToString(" "))
}