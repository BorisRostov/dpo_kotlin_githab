interface CurrencyConverter {
    val currencyCode : String
    val kurs : Double
    fun convertToRub(sum : Int, kurs : Double) : Int {
        val result = (kurs * sum).toInt()
        println(
            """
           The exchange rate of this currency is $kurs to 1
           the amount of $result RUB = $sum $currencyCode
        """.trimIndent())
        return result
    }
}