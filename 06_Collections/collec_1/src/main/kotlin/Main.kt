import kotlin.random.Random

fun main() {
    var n = 0
    do { n = readln().toInt()
        if (n <= 0) println("the number must be greater than 0")
    } while (n <= 0)
    val vallist = MutableList(n){Random.nextInt(-5,5)}
    println(vallist)
    var varlist = vallist.toMutableList()
    varlist.ForE
    for (i in 0 until n) {
        if (varlist[i] % 2 == 0) varlist[i] = varlist[i]*10
    }
    println(varlist.sumOf { it })
    val listpolog = varlist.filter { it > 0 }
}