open class DebitCard(balance: Int): BankCard(balance) {

    override fun replenish() {                       // внести деньги
        println("Enter the amount you need to top up your account with:")
        balance += readln().toInt()
        getinfobalance()
    }

    override fun getinfoavailablemoney() = getinfobalance()


    override fun topay(): Boolean {          // Оплатить
        var moneyOk: Boolean = false
        val a = readln().toInt()
        if(a <= balance) {
            balance -= a
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