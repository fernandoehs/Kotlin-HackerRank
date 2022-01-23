//Find The Difference   Problem:https://leetcode.com/problems/find-the-difference/Example 1:
//
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.
//Example 2:
//
//Input: s = "", t = "y"
//Output: "y"
//
//
//Constraints:
//
//0 <= s.length <= 1000
//t.length == s.length + 1
//s and t consist of lowercase English letters.



fun main(){
    val s = "abcd"

    val t = "abcdw"

    println ( findTheDifference(s,t))

}
fun findTheDifference(s: String, t: String):Char? {

    val sl = s.toCharArray().toMutableList()
    t.forEach{
        if(!sl.remove(it)) return it
        //  println (it::class.java.typeName) tipo de v
    }
    return  null
}


