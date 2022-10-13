fun main() {
    println("Select a currency")
    val cur = readln().toUpperCase()
    println("Enter the amount you want to convert")
    val sum = readln().toInt()
    Converters.get1(cur).convertToRub(sum)}



