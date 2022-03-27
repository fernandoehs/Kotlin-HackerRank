// Fernando Herrera
import kotlin.random.Random

fun mySort(arr:IntArray,oddNumber:Int):IntArray{
    var count = 0
    val j = arr.size-1
    val evenNumber = arr.size - oddNumber


    for( i in 0 until arr.size){


        if(arr[0]%2 ==0 && evenNumber==1) {              // 1 even in the begin
            break
        } else if(arr[j]%2 !=0 && oddNumber==1){         // 1 odd in the end
            break
        } else if(arr[i]%2 !=0 && oddNumber==1){         // 1 odd in the array copy to at end

            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp

        }else if(arr[i]%2 ==0 && evenNumber==1){         // 1 even in the array copy to at begin

            val temp = arr[i]
            arr[i] = arr[0]
            arr[0] = temp

        }else if(evenNumber>oddNumber){
            if(arr[i]%2 ==0  && count<evenNumber){

                val temp = arr[i]
                arr[i] = arr[count]
                arr[count] = temp
                count += 1

            }
        }else if(oddNumber>=evenNumber){
            if(arr[i]%2 ==0  && count<oddNumber){

                val temp = arr[i]
                arr[i] = arr[count]
                arr[count] = temp
                count += 1

            }
        }
    }
    return arr
}

fun oddNumber(arr:IntArray):Int{
    var odds =0
    for(number in arr){
        if(number%2 !=0){
            odds++
        }
    }
    return odds
}

fun main( ){

    print("Enter no. of elements :")
    val n = readLine()!!.toInt()
    val listRandom = IntArray(n){ Random.nextInt(0, 10) }

    println("Array Random :")
    for (k in listRandom) print("$k ")
    println()

    val list  = mySort(listRandom,oddNumber(listRandom))

    println("Array Random Even numbers beginning :")
    for (k in list) print("$k ")
}