fun main() {
    val anonnim = object : CurrencyConverter {
        override val currencyCode = "Unknown currency"
        override val kurs : Double = 1.0}
    fun pr(){
        println("Select a currency")
        val cur = readln().toUpperCase()
        if (cur in Converters.currency) {
            println("Enter the amount you want to convert")
            val sum = readln().toInt()
            Converters.get(cur, sum)
        }
        else {
            println("Enter the currency rate")
            val kurs = readln().toDouble()
            println("Enter the amount you want to convert")
            val sum = readln().toInt()
            anonnim.convertToRub(sum,kurs)
        }
    }
    println(Converters.currency)
    pr()
    pr()
    pr()
}