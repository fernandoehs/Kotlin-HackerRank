// 9. Staircase - HackerRank :https://www.hackerrank.com/challenges/staircase/problem
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    // Write your code here
    for(line in 1..n){
        print(" ".repeat(n-line))
        println("#".repeat(line))
    }


}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}