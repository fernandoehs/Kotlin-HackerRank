data class ExamResult(val name:String, val score:Int)

fun main(){
    runTests()
}

fun getExamGrade(result: ExamResult):String{
    return when(result.score){
        in 90..100 -> "A"
        in 80..89 ->"B"
        in 70..79 ->"C"
        else -> "D"
    }
}

fun countScoresHigherThan(threshold:Int, result:List<ExamResult>):Int {
    return result.count{it.score > threshold}
}


fun runTests(){
    val examResult=listOf(
        ExamResult("Mary",91),
        ExamResult("Nata",85),
        ExamResult("George",70),
        ExamResult("Peter",42),
        ExamResult("Maria",99),
        ExamResult("Noob",81)


    )

    check("A" ==getExamGrade(examResult[0])){
        "91 should translate to A"
    }
    check(2==countScoresHigherThan(85,examResult)){
        "two students scored than 85"
    }
}