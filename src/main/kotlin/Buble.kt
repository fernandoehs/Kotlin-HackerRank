import kotlin.random.Random

fun arreglar(arr:IntArray,impares:Int):IntArray{
    var contador = 0
    val j = arr.size-1
   // println("j:$j")

    val pares = arr.size - impares

 //   println("pares:$pares")
        //solo mover una vez pero si esta en el ultimo arr[j] no mover si es impar
        // si solo hay uno pero es par y es arr[i] no mover


    for( i in 0 until arr.size){ // recorre todo

       // println("i:$i")

         if(arr[0]%2 ==0 && pares==1) { //par solo al inicio
           //  println("hola par")
             break
         } else if(arr[j]%2 !=0 && impares==1){ // impar al final
            // println("hola impar")
             break
         } else if(arr[i]%2 !=0 && impares==1){ //1 impar en el medio lo copia al final
            // println(arr[i])

             val temp = arr[i]
             arr[i] = arr[j]
             arr[j] = temp

         }else if(arr[i]%2 ==0 && pares==1){ //1 par en el medio lo copia al inicio
            // println(arr[i])

             val temp = arr[i]
             arr[i] = arr[0]
             arr[0] = temp



         }else if(pares>impares){
             if(arr[i]%2 ==0  && contador<pares){  // par es menor
               //  println("arreglo[i]:"+ arr[i])
                // println("j dentro:$j")

                 val temp = arr[i]
                 arr[i] = arr[contador]
                 arr[contador] = temp
                // j -= 1
                 contador += 1


             }
         }else if(impares>=impares){
             if(arr[i]%2 ==0  && contador<impares){  // par es mayor
               //  println("arreglo[i]:"+ arr[i])
               //  println("j dentro:$j")

                 val temp = arr[i]
                 arr[i] = arr[contador]
                 arr[contador] = temp
                // j -= 1
                 contador += 1


             }
         }







        //for (k in arr) println("$k ")
    }
    return arr
}

fun impares(arr:IntArray):Int{
    var impar =0
    for(numero in arr){
        if(numero%2 !=0){
            impar++
        }
    }
   // println("impares $impar")
    return impar

}

fun main( ){
   // val myRandomValues = IntArray(4) { Random.nextInt(0, 30) }
    print("Enter no. of elements :")
    var n = readLine()!!.toInt()
    var lista = IntArray(n){ Random.nextInt(0, 10) }
    //println(lista)
    println("Array Random :")
    for (k in lista) print("$k ")
    println()
  // val list  = arreglar(intArrayOf(5,4,1,8,7,2),impares(intArrayOf(5,4,1,8,7,2)))
    val list  = arreglar(lista,impares(lista))
    // println(pares(list))
    println("Array Random Odds beginning :")
    for (k in list) print("$k ")
}