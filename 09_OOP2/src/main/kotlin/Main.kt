

fun main() {
    val deb = Tinkof(1000,100,0.05)
    val credAlfaBank = AlfaBank(1000, 20000, 10000, 0.04)
    val credSber = CreditCard(1000, 10000, 10000)

    lateinit var viborUser: BankCard

    println("""
    Which card do you want to use
    1 - Debit card 
    2 - Credit card ALFA
    3 - Credit card SBER
    """.trimIndent()
    )
    var vibor = readln()
    when (vibor) {
        "1" -> {
            viborUser = deb
            println("You have chosen a debit card")
            viborUser.getinfoavailablemoney()
        }
        "2" -> {
            viborUser = credAlfaBank
            println("You have chosen a credit card")
            println(
                """
Credit limit: ${viborUser.creditlimit}
Credit part: ${viborUser.creditpart}
Own part: ${viborUser.balance}
        """.trimMargin()
            )
        }
        "3" -> {
            viborUser = credSber
            println("You have chosen a credit card")
            println(
                """
Credit limit: ${viborUser.creditlimit}
Credit part: ${viborUser.creditpart}
Own part: ${viborUser.balance}
        """.trimMargin()
            )
        }
        else -> {
            println("Incorrect input")
            exit()
        }
    }
    println("""
what kind of operation do you want to perform?
1 - Replenish
2 - To pay
3 - Get information about the balance ( Debit )
  - Get information about available funds ( Credit )
4 - Change the card  
    """.trimIndent()
    )
    while(true){
    viborUser.oper(readln())}

}
fun exit() {
    return main()
}









/*

    when (vibor) {
        "1" -> viborUser.replenish()
        "2" -> viborUser.topay()
        "3" -> viborUser.getinfoavailablemoney()
        else -> {
            println("incorrect input")
            exit()
        }
    }

Кредитная карта с лимитом 10 000.
Кредитные средства: 10 000.
Собственные средства: 0.

После пополнения карты на 5 000:
Кредитные средства: 10 000.
Собственные средства: 5 000.

   После оплаты на 5 000:
   Кредитные средства: 10 000.
   Собственные средства: 0.

   После оплаты на 3 000:
   Кредитные средства: 7 000.
   Собственные средства: 0.

   После пополнения на 2 000:
   Кредитные средства: 9 000.
   Собственные средства: 0.

   После пополнения на 2 000:
   Кредитные средства: 10 000.
   Собственные средства: 1 000.
 */