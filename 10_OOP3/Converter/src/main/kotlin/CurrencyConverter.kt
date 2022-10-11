interface CurrencyConverter {
    val currencyCode: String
    fun convertToRub(kurs: Double, sum: Int) {
        println(
            """
           The exchange rate of this currency is $kurs to 1
           the amount of ${(kurs*sum).toInt()} rubles
        """.trimIndent())
    }
}