class AlfaBank(balance: Int,
               creditlimit: Int,
               creditpart: Int,
               var cashback: Double = 0.05): CreditCard(balance, creditlimit, creditpart) {

    override fun topay(sum : Int) : Boolean {
        if (super.topay(sum)) {
            addCashback(sum)
        }
        return true
    }

    fun addCashback(sum: Int){
        if (sum>=5000) balance += (sum * cashback).toInt()
    }
}