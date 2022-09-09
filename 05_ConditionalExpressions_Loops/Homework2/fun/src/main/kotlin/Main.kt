fun main() {
    var result: Long = 0
    var fibn = 0
    do { fibn = readln().toInt()
        if (fibn < 0) println("the number must be greater than 0")
    } while (fibn < 0)

    when (fibn) {
        0 -> result = 0
        1 -> result = 1
        else -> result = sum(fibn)
    }
    println(result)
}
fun sum(n: Int): Long {
    var f1:Long = 0
    var f2:Long = 1
    var f3:Long = 1
    for (i in 2 until n) {
        f3 = f1 + f2
        f1 = f2
        f2 = f3
    }
    return f3
}