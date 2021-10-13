
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val chunked = list.chunked(3)

    print(chunked)
    // [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
}