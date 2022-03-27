import kotlin.random.Random

fun counting_sort(A: Array<Int>, max: Int) {
    // Array in which result will store
    var B = Array<Int>(A.size, { 0 })
    // count array
    var C = Array<Int>(max, { 0 })
    for (i in 0..A.size - 1) {
        //count the no. of occurrence of a
        //particular element store in count array
        C[A[i] - 1] = C[A[i] - 1] + 1
    }
    for (i in 1..C.size - 1) {
        // calculate commutative sum
        C[i] = C[i] + C[i - 1]
    }
    for (i in A.size - 1 downTo 0) {
        // place the element at its position
        B[C[A[i] - 1] - 1] = A[i]
        // decrease the occurrence of the element by 1
        C[A[i] - 1] = C[A[i] - 1] - 1
    }
    println("After sorting :")
    for (i in B) {
        print("$i ")
    }

}

/**
 * Creates random array or Long of given length and max value
 * @param length length of an array to be generated
 * @param maxValue
 */
fun randomNumericArray(length: Int, maxValue : Int = 10) : Array<Long>{
    return Array<Long>(length, {i -> Math.round(maxValue * Math.random())});
}


var nPares = 0
fun contarpares(A: List<Int>):Int{
    //println(A[i])
    for (element in A) {
        if (element % 2 == 0) {
            nPares++
        }
    }
    println("pares dentro $nPares")
    return nPares
}

fun sorting(A:List<Int>,NPares:Int){
    println("este es el nro pare $NPares")
    var NInpares = A.size - NPares
    var topepar = NPares


    for (i in 0 until A.size){

        if (A[i] % 2 == 0){
            topepar -= 1
            println("este es el tope $topepar")
        }
    }
}




fun main(arg: Array<String>) {
    print("Enter no. of elements :")
    var n = readLine()!!.toInt()

   // randomNumericArray(n, 10)
    //val myRandomValues = List(n) { Random.nextInt(0, 30) }
    val myRandomValues = listOf<Int>(2,7,4)
    // Prints a new sequence every time3
    println(myRandomValues)
    var pares = contarpares(myRandomValues)
    println(pares)
    sorting(myRandomValues,pares)
//    println("Enter elements : ")
//    var A = Array(n, { 0 })
//    for (i in 0 until n)
//        A[i] = readLine()!!.toInt()
//    // calculate maximum element from array
//    var max = A[0];
//    for (i in A) {
//        if (i > max) {
//            max = i
//        }
//    }
    //counting_sort(myRandomValues, n+1)
}