class Tinkof (balance: Int,
              var bonus: Int = 0,
              var bonpr: Double = 1.0

              ): DebitCard(balance) {

    override fun getinfobalance() = println("""
        Balance: $balance
        Bonis: $bonus
    """.trimIndent())

    override fun topay(): Boolean {

        var moneyOk: Boolean = false
        val a = readln().toInt()
        if(a <= bonus) {
            bonus = a - bonus
            balance = balance
            bonus += (a*bonpr).toInt()
            moneyOk = true
            println("Purchase completed")
            getinfoavailablemoney()
        }
        else if (a > bonus && a <= (bonus+balance) ){

            balance -= (a - bonus)
            bonus += (a*bonpr).toInt()
            moneyOk = true
            println("Purchase completed")
            getinfoavailablemoney()
        }
        else {
            moneyOk = false
            println("Purchase rejected")
            getinfoavailablemoney()
        }
        return moneyOk
    }







}