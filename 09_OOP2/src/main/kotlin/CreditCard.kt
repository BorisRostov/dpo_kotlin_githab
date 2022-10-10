open class CreditCard(balance: Int,
                      var creditlimit: Int,
                      var creditpart: Int
): BankCard(balance) {

    override fun getinfoavailablemoney() = println("""
Credit part: $creditpart
Own part: $balance""".trimMargin())

    override fun replenish(sum : Int) {
        println("Enter the amount you need to top up your account with:")
        if (creditpart >= creditlimit) balance += sum
        else {
            var b = (sum + creditpart) - creditlimit
            if (b <= 0) creditpart += sum
            else {
                creditpart = creditlimit
                balance += b
            }
        }
        println("Replenishment of the card in the amount of $sum")
    }
    override fun topay(sum : Int): Boolean {          // При оплате сначала списываются собственные средства, затем кредитные.
        var moneyOk: Boolean = false
        val os = balance + creditpart
        if (sum <= os) {
            moneyOk = true
            println("The purchase was made in the amount of $sum")
            if (balance < sum) {
                creditpart -= (sum - balance)
                balance = 0
            } else balance -= sum
        } else {
            moneyOk = false
            println("Purchase rejected")
            exit()
        }
        return moneyOk
    }
}



