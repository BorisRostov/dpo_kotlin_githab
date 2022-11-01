import kotlinx.coroutines.delay
import java.math.BigInteger

object Fibonacci {
    suspend fun take(n : Int) : BigInteger {
        var f1 : BigInteger = 0.toBigInteger()
        var f2 : BigInteger = 1.toBigInteger()
        var f3 : BigInteger = 1.toBigInteger()
        for (i in 2 until n) {
            f3 = f1 + f2
            f1 = f2
            f2 = f3
            delay(100)
            print(".")
        }
        return f3
    }
}

