fun main() {
var str = "F2p)vy233{0->c}ttelciFc"
var str1 = str.take(str.length/2)      // Разделить сообщение пополам.
var str2 = str.takeLast(str.length/2)   // Разделить сообщение пополам.

str1 = str1.map {char -> char + 1}.joinToString("")

str1.replace('5', 's').replace('4', 'u')

str1 = str1.map {char -> char - 3}.joinToString("")
str1 = str1.replace("0", "o")

str2 = str2.reversed().map {char -> char - 4}.joinToString("")
str2 = str2.replace('_', ' ')
str = str1 + str2
str
println(str)
}