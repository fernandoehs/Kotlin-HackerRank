// 6. PlusMinus - HackerRank : https://www.hackerrank.com/challenges/plus-minus/problem
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun main() {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    var positive=0
    var negative=0
    var zero=0

    val sizearray = arr.size
    for(i in arr ){
        when {
            i> 0 -> positive += 1
            i < 0 -> negative += 1
            else -> zero += 1
        }

    }
    val positiveocurrence = positive/sizearray.toDouble()
    val negativeocurrence = negative/sizearray.toDouble()
    val zeroocurrence = zero/sizearray.toDouble()

    println(positiveocurrence)
    println(negativeocurrence)
    println(zeroocurrence)

}
