class Cards {
    var row1 = mutableListOf<Int>()
    var row2 = mutableListOf<Int>()
    var row3 = mutableListOf<Int>()
    private val cardNumbers = mutableListOf<Int>()
    private var card : MutableList<MutableList<Int>> = mutableListOf()

    init {
        row1 = fillRow(row2, row3)
        row2 = fillRow(row1, row3)
        row3 = fillRow(row1, row2)
        card = fillCard(row1, row2, row3)
        for (i in 0..4) {
            cardNumbers.add(row1[i])
            cardNumbers.add(row2[i])
            cardNumbers.add(row3[i])
        }
        cardNumbers.sort()
    }

    private fun fillRow(row2Temp : MutableList<Int>, row3Temp : MutableList<Int>) : MutableList<Int> {
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
                        in 1..9 -> tempNumb.removeAll(tempColumn1)
                        in 10..19 -> tempNumb.removeAll(tempColumn2)
                        in 20..29 -> tempNumb.removeAll(tempColumn3)
                        in 30..39 -> tempNumb.removeAll(tempColumn4)
                        in 40..49 -> tempNumb.removeAll(tempColumn5)
                        in 50..59 -> tempNumb.removeAll(tempColumn6)
                        in 60..69 -> tempNumb.removeAll(tempColumn7)
                        in 70..79 -> tempNumb.removeAll(tempColumn8)
                        in 80..90 -> tempNumb.removeAll(tempColumn9)
                    }
                    rowCount++
                }
            }
        }
        row1temp.sort()
        return row1temp
    }

    private fun fillCard(row1 : MutableList<Int>,  row2 : MutableList<Int>, row3 : MutableList<Int>) : MutableList<MutableList<Int>> {
        return mutableListOf(row1, row2, row3)
    }

    fun creatCards(): MutableList<MutableList<String>>  {
        val cardTemp = MutableList(3) { MutableList(9) { "  " } }
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
        return cardTemp
    }

    private companion object {
        private val tempColumn1 = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        private val tempColumn2 = mutableListOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
        private val tempColumn3 = mutableListOf(20, 21, 22, 23, 24, 25, 26, 27, 28, 29)
        private val tempColumn4 = mutableListOf(30, 31, 32, 33, 34, 35, 36, 37, 38, 39)
        private val tempColumn5 = mutableListOf(40, 41, 42, 43, 44, 45, 46, 47, 48, 49)
        private val tempColumn6 = mutableListOf(50, 51, 52, 53, 54, 55, 56, 57, 58, 59)
        private val tempColumn7 = mutableListOf(60, 61, 62, 63, 64, 65, 66, 67, 68, 69)
        private val tempColumn8 = mutableListOf(70, 71, 72, 73, 74, 75, 76, 77, 78, 79)
        private val tempColumn9 = mutableListOf(80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90)
    }


}