class Cards {
    var row1 = MutableList(9){0}
    var row2 = MutableList(9){0}
    var row3 = MutableList(9){0}
    var card = listOf(row1.toList(),row2.toList(),row3.toList())
    init {
        row1 = fillRow(row2, row3)
        row2 = fillRow(row1, row3)
        row3 = fillRow(row1, row2)
        card = fillcard(row1, row2, row3)
    }

    fun fillcard(r1: List<Int>, r2: List<Int>, r3: List<Int>): List<List<Int>> {
        val card = listOf(r1,r2,r3)
        printCards(card)
        return card
    }

    fun fillRow(row2Temp : MutableList<Int>, row3Temp : MutableList<Int>) : MutableList<Int> {
        val numbers = mutableListOf<Int>()
        for (number in 1..90) numbers.add(number)
        val row1temp = mutableListOf<Int>()
        var rowCount = 0
        val tempNumb : MutableList<Int> = numbers
        while (rowCount < 5) {
            val temp = (1..90).random()
            if (!row2Temp.contains(temp) && !row3Temp.contains(temp)) {
                if (tempNumb.contains(temp)) {
                    row1temp.add(temp)
                    when (temp) {
                        in 1..9 -> tempNumb.removeAll(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
                        in 10..19 -> tempNumb.removeAll(mutableListOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19))
                        in 20..29 -> tempNumb.removeAll(mutableListOf(20, 21, 22, 23, 24, 25, 26, 27, 28, 29))
                        in 30..39 -> tempNumb.removeAll(mutableListOf(30, 31, 32, 33, 34, 35, 36, 37, 38, 39))
                        in 40..49 -> tempNumb.removeAll(mutableListOf(40, 41, 42, 43, 44, 45, 46, 47, 48, 49))
                        in 50..59 -> tempNumb.removeAll(mutableListOf(50, 51, 52, 53, 54, 55, 56, 57, 58, 59))
                        in 60..69 -> tempNumb.removeAll(mutableListOf(60, 61, 62, 63, 64, 65, 66, 67, 68, 69))
                        in 70..79 -> tempNumb.removeAll(mutableListOf(70, 71, 72, 73, 74, 75, 76, 77, 78, 79))
                        in 80..90 -> tempNumb.removeAll(mutableListOf(80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90))
                    }
                    rowCount++
                }
            }
        }
        row1temp.sort()
        return row1temp
    }
    fun printCards(card : List<List<Int>>) : List<List<String>> {
        val cardTemp = MutableList(3) { MutableList(9) { "  " } }
        println("----------------------------------------------")
        println("----------------------------------------------")
        for (column in 0..2) {
            print("|")
            for (row in 0..8) {
                for (i in 0 until card[column].size) {
                    when (card[column][i]) {
                        in 1..9 -> cardTemp[column][0] = " ${card[column][i]}"
                        in 10..19 -> cardTemp[column][1] = card[column][i].toString()
                        in 20..29 -> cardTemp[column][2] = card[column][i].toString()
                        in 30..39 -> cardTemp[column][3] = card[column][i].toString()
                        in 40..49 -> cardTemp[column][4] = card[column][i].toString()
                        in 50..59 -> cardTemp[column][5] = card[column][i].toString()
                        in 60..69 -> cardTemp[column][6] = card[column][i].toString()
                        in 70..79 -> cardTemp[column][7] = card[column][i].toString()
                        in 80..90 -> cardTemp[column][8] = card[column][i].toString()
                    }
                }
                print(" ${cardTemp[column][row]} |")

            }
            println()
        }
        println("----------------------------------------------")
        println("----------------------------------------------")
        println("----------------------------------------------")
        println("----------------------------------------------")

        return cardTemp
    }
}
