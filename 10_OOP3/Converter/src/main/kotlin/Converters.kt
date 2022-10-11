object Converters {
    val usd = USD()
    val eur = EURO()
    val cny = CNY()
    val knowncurrency = listOf(usd.currencyCode, eur.currencyCode, cny.currencyCode)



    fun get(currencyCode : String) {
        println("Enter the amount you want to convert")
        when (currencyCode) {
            "USD" -> {
                val sum = readln().toInt()
                usd.convertToRub(61.25, sum)
            }
            "EURO" -> {
                val sum = readln().toInt()
                eur.convertToRub(59.89, sum)
            }
            "CNY" -> {
                val sum = readln().toInt()
                cny.convertToRub(8.56, sum)
            }
        }
    }
}