

abstract class BankCard (var balance: Int) {

    abstract fun topay(sum : Int): Boolean
    open fun getinfobalance() = println("balance $balance")    // баланс
    abstract fun getinfoavailablemoney()
    abstract fun replenish(sum : Int)  // внести деньги companion object

}
