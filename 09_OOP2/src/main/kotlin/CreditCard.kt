open class CreditCard(balance: Int,
                 var creditlimit: Int,
                 var creditpart: Int
): BankCard(balance) {

    override fun getinfoavailablemoney() {
        println(
            """
Credit part: $creditpart
Own part: $balance
        """.trimMargin()
        )
    }
    override fun replenish() {                                                // внести деньги
        println("Enter the amount you need to top up your account with:")
        val a = readln().toInt()
        if (creditpart >= creditlimit) balance += a
        else {
            var b = (a + creditpart) - creditlimit
            if (b <= 0) creditpart += a
            else {
                creditpart = creditlimit
                balance += b
            }
        }
        println("Replenishment of the card in the amount of $a")
        getinfoavailablemoney()
    }
    // При оплате сначала списываются собственные средства, затем кредитные.

    override fun topay(): Boolean {          // Оплатить
        var moneyOk: Boolean = false
        val os = balance + creditpart
        val a = readln().toInt()
        if (a <= os) {
            moneyOk = true
            println("The purchase was made in the amount of $a")
            if (balance < a) {
                creditpart -= (a - balance)
                balance = 0
            } else balance -= a
            getinfoavailablemoney()
        } else {
            moneyOk = false
            println("Purchase rejected")
            exit()
        }
        return moneyOk
    }


}



