open class DebitCard(balance: Int): BankCard(balance) {

    override fun replenish(sum: Int) {                       // внести деньги
        println("Enter the amount you need to top up your account with:")
        balance += sum
    }

    override fun getinfoavailablemoney() = getinfobalance()

    override fun topay(sum: Int): Boolean {          // Оплатить
        var moneyOk: Boolean = false
        if(sum <= balance) {
            balance -= sum
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