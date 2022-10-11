object Converters {
    val currency = listOf(USD().currencyCode, EURO().currencyCode, CNY().currencyCode)
    val currency1 = listOf(USD(), EURO(), CNY())
    fun get(currencyCode : String, sum : Int) {
        when (currencyCode) {
            "USD" -> USD().convertToRub(sum, kurs = 61.25)
            "EUR" -> EURO().convertToRub(sum, kurs = 60.25)
            "CNY" -> CNY().convertToRub(sum, kurs = 10.25)
        }
    }

//    fun get1(currencyCode : String, sum : Int) : CurrencyConverter {
//        return currency1.find { it.currencyCode -> it.kurs } ?: object : CurrencyConverter {
//            override val currencyCode : String
//                get() = TODO("Not yet implemented")
//            override val kurs : Double
//                get() = TODO("Not yet implemented")
//            override fun convertToRub(sum : Int, kurs : Double) : Int {
//                val result = (kurs * sum).toInt()
//                println(
//                    """
//           The exchange rate of this currency is $kurs to 1
//           the amount of $result RUB = $sum $currencyCode
//        """.trimIndent()
//                )
//                return result
//            }
//        }
//    }
}
