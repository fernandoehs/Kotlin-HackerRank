//13. FizzBuzz            Problem LeetCode:https://leetcode.com/problems/fizz-buzz/
fun main(){
    println (fizzBuzz(15))
}

fun fizzBuzz(n: Int): MutableList<String> {
    val lista = mutableListOf<String>()
    for(i in 1..n){
        when{
            (i%3==0 && i%5==0) -> lista.add("FizzBuzz")
            (i%3==0)->lista.add("Fizz")
            (i%5==0)->lista.add("Buzz")
            (i==1)->lista.add("1")
            (i==2) ->lista.add("2")
            else -> lista.add("$i")
        }
    }

    return lista
}