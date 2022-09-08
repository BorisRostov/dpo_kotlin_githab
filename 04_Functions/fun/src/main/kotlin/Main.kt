fun main() {
    var str = "F2p)v\"y233{0->c}ttelciFc"
    var str1 = str.take(str.length/2)      // Разделить сообщение пополам.
    var str2 = str.takeLast(str.length/2) // Разделить сообщение пополам.
    str = first(str1) + second(str2)
    println(str)
}
fun first(s:String): String {
    var result: String
    result = s.map {char -> char + 1}.joinToString("")
        .replace('5', 's')
        .replace('4', 'u')
        .map {char -> char - 3}.joinToString("")
        .replace("0", "o")
    return result
}
fun second(s:String):String{
    var result: String
    result = s.reversed().map {char -> char - 4}.joinToString("")
    result = result.replace('_', ' ')
    return result
}