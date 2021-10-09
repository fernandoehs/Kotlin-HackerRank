// 12. Pascal's Triangle   Problema LeetCode : https://leetcode.com/problems/pascals-triangle/

    fun generate(numRows: Int): List<List<Int>> {
        val pascalT: MutableList<List<Int>> = ArrayList()
        for (i in 1..numRows) {
            val row: MutableList<Int> = ArrayList()
            for (j in 1..numRows - (numRows - i)) {
                if (j == 1 || j == numRows - (numRows - i)) row.add(1)
                else row.add(pascalT[i - 2][j - 2] + pascalT[i - 2][j - 1])

            }
            pascalT.add(row)
        }
        return pascalT
    }
