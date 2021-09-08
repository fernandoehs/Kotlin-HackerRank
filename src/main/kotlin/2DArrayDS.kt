// 8. 2D Array DS  -  HackerRank Problem : https://www.hackerrank.com/challenges/2d-array/problem
import java.lang.Integer.max
import java.util.*



    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val arr = Array(6) { IntArray(6) }
        for (arr_i in 0..5) {
            for (arr_j in 0..5) {
                arr[arr_i][arr_j] = `in`.nextInt()
            }
        }
        Sum(arr)
    }

    private fun Sum(arr: Array<IntArray>) {
        //ROw
        var maxsum = -63
        for (i in 0..3) {
            for (x in 0..3) {
                val top = arr[i][x] + arr[i][x + 1] + arr[i][x + 2] + arr[i + 1][x + 1] + arr[i + 2][x] + arr[i + 2][x + 1] + arr[i + 2][x + 2]
                maxsum =max(maxsum,top)


            }
        }
        println(maxsum)
    }



