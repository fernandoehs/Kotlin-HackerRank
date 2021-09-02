// 3. Compare The Triplets - HackerRank : https://www.hackerrank.com/challenges/compare-the-triplets/problem

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var alice =0
    var bob = 0


    for(i in 0..2 ){
        if(a[i]> b[i]) alice +=1
        if(a[i] < b[i]) bob +=1

    }

    return arrayOf(alice, bob)

}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
