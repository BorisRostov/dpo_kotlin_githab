object Converters {
    val currency1 = listOf(USD(), EURO(), CNY())
    fun get1(currencyCode : String) =
        currency1.find { it.currencyCode == currencyCode } ?: object : CurrencyConverter {
            override val currencyCode = "Unknown currency"
            override val kurs : Double = readln().toDouble()
        }

}