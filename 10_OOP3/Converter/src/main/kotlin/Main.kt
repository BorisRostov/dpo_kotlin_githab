fun main() {
    val anonnim = object: CurrencyConverter{
        override val currencyCode = "unknown"
        override fun convertToRub(kurs : Double, sum : Int) {
            println(
                """
           The exchange rate of this currency is $kurs to 1
           the amount of ${(kurs*sum).toInt()} rubles
        """.trimIndent())
        }

    }

    println("Select a currency")
    println(Converters.knowncurrency)
    val cur = readln().toUpperCase()
    if (cur in Converters.knowncurrency) {
        Converters.get(cur)}
    else {
        println("Enter the currency rate")
        val kurs = readln().toDouble()
        println("Enter the amount you want to convert")
        val sum = readln().toInt()
        anonnim.convertToRub(kurs,sum)}
}
