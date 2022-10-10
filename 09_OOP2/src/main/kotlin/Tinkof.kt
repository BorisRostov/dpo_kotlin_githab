class Tinkof (balance: Int,
              var bonus: Int = 0,
              var bonpr: Double = 1.0

): DebitCard(balance) {

    override fun getinfobalance() = println("""
        Balance: $balance
        Bonis: $bonus
    """.trimIndent())

    override fun topay(sum : Int): Boolean {
        var moneyOk: Boolean = false
        if(sum <= bonus) {
            bonus = sum - bonus
            balance = balance
            bonus += (sum*bonpr).toInt()
            moneyOk = true
            println("Purchase completed")
        }
        else if (sum > bonus && sum <= (bonus+balance) ){
            balance -= (sum - bonus)
            bonus += (sum*bonpr).toInt()
            moneyOk = true
            println("Purchase completed")
        }
        else {
            moneyOk = false
            println("Purchase rejected")
        }
        return moneyOk
    }
}