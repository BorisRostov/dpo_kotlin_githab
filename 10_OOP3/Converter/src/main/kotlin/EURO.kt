class EURO: CurrencyConverter {
    override val currencyCode : String = "EUR"


    override fun convertToRub(kurs: Double, sum : Int) {

        println(
            """
           The exchange rate of this currency is $kurs to 1
           the amount of ${(kurs*sum).toInt()} rubles
        """.trimIndent())
    }


}