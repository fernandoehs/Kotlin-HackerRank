//Problem RotateArray  rota el arreglo k posiciones: dado [1,2,3,4,5,6,7] con k =2 regresa [3,4,5,6,7,1,2]

fun main (){
    val arrayToRotate = intArrayOf(1,2,3,4,5,6,7)

    val rotatedArray = arrayToRotate.correizquierda(2)

    for( e in rotatedArray){
        println(e)
    }

}

fun IntArray.correizquierda(k:Int):IntArray{  // esta es una Extension Function
    val shiftedArray = this.copyOf()       //copia el arreglo
    var rotateBy = k

    if (rotateBy>size){           // si excede el tamano del arreglo
        rotateBy %=size
    }


    // esta funcion foreachindexed se aplica a cada indice y elemento una accion
    // 0 + (7-2) = 5 % 7 = 5 luego shiftedArray[5] = 1
    // 1 + (7-2) = 6 % 7 = 6 luego shiftedArray[6] = 2
    // 2 + (7-2) = 7 % 7 = 0 luego shiftedArray[0] = 3
    // 3 + (7-2) = 8 % 7 = 1 luego shiftedArray[1] = 4
    // 4 + (7-2) = 9 % 7 = 2 luego shiftedArray[2] = 5
    // 5 + (7-2) = 10 % 7 = 3 luego shiftedArray[3] = 6
    // 6 + (7-2) = 11 % 7 = 4 luego shiftedArray[4] = 7
    // Luego shiftedArray= [3,4,5,6,7,1,2]

    forEachIndexed {
            index, i ->
                       val shiftedIndex = (index + (size-rotateBy)) % size
            shiftedArray[shiftedIndex] = i
    }

    return shiftedArray


}

