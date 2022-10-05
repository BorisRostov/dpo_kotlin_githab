

abstract class BankCard (var balance: Int) {

    abstract fun topay(): Boolean
    open fun getinfobalance() = println("balance $balance")    // баланс
    abstract fun getinfoavailablemoney()
    abstract fun replenish()  // внести деньги companion object


    open fun oper(a: String) {
        when {
            a == "1" -> replenish()
            a == "2" -> topay()
            a == "3" -> getinfoavailablemoney()
            a == "4" -> {println("Change the card")
            exit()}
            else -> {
                println("Incorrect input")
                return
            }
        }
    }
}

//         set(value) {
//            if (!value) println("Card is NOT in ATM")
//            else println("Card is in ATM")
//            field = value}
