// 11. The Descent - CodingGame https://www.codingame.com/training/easy/the-descent
import java.util.*


/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
fun main() {
    val input = Scanner(System.`in`)
    var index = 0
    var height = 0

    // game loop
    while (true) {
        for (i in 0 until 8) {
            val mountainH = input.nextInt()
            // represents the height of one mountain.
            if (mountainH > height){
                height=mountainH
                index = i
            }
        }

        // Write an action using println()
        // To debug: System.err.println("Debug messages...");

        println(index) // The index of the mountain to fire on.
    }
}