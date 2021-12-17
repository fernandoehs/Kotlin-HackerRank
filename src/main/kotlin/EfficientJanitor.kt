//14. EfficientJanitor            Problem HackerRank


import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun efficientJanitor(weight: Array<Float>): Int {
    weight.sort() //ordenamos el arreglo

    var n= weight.size //tamano del arreglo
    var lo=0  // inicializa en la primera posicion del arreglo
    var hi=n-1  // inicializa en la ultima posicion en el arreglo
    var ans=0   // respuesta inicializada en cero

    while(lo<hi){  // mientras la posicion inicial es menor al mayor
        if(weight[lo]+weight[hi]>3.0){       //si la suma del primero + el ultimo es mayor a 3
            hi=hi-1                          // ultimo se resta uno
        }else{
            lo=lo+1                         // Sino avanza una posicion
            hi=hi-1                         // se disminuye un posision al ultimo
        }
        ans =ans +1                         // sumo 1 a la respuesta

    }
    //a bag is left, so 1 more trip , 1 solo viaje
    if(lo==hi){
        ans=ans+1
    }

    return ans
}

fun main(args: Array<String>) {
    var weightCount = readLine()!!.trim().toInt()

 val weight = Array<Float>(weightCount, { 0f })
   // var weight = floatArrayOf(0f)
  //  weightCount = weight.size

    for (i in 0 until weightCount) {
        val weightItem = readLine()!!.trim().toFloat()
        weight[i] = weightItem
    }

    val result = efficientJanitor(weight)

    println(result)
}

//Error Handling:
//
//1. It is important to sort the array in non - descending order.
//
//2. Decrement the right pointer by 1 if the current pair forms a sum greater than 3.
//
//3. If both the pointers are equal, there is a bag left so increment the trip counter.

//Time Complexity - O(N log N).
//
//Sorting the array takes O(NlogN) time, and then the two pointers traversal take O(N) time only.
//
//
//
//Space Complexity - O(1) - No extra space is required.


//Optimal Solution:
//
//There can be no more than 2 numbers in a group because the minimum possible sum of 3 numbers is 1.01 + 1.01 + 1.01 = 3.03, which exceeds 3.
//
//Sort the given array in non - descending order.
//
//Maintain two pointers over the array, starting with lo = 0, hi = n - 1.
//
//If the two elements sum to greater than 3, then its always optimal to add a trip for index arr[hi] and decrement hi by 1. If their sum is ≤ 3, then increment lo by 1, decrement hi by 1, and increment the trip counter.
//
//Iterate while lo is less than hi. If lo = hi at the end, then there is a single element that must be in its own trip.