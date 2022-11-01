import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Default
import java.lang.reflect.Array
import java.math.BigInteger
import kotlin.concurrent.thread
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.random.Random
import kotlin.random.asJavaRandom
import kotlin.system.measureTimeMillis


suspend fun main() {
    runBlocking {
        val oneCor = launch {
            val number = 65 // Random.nextInt(200, 2000)
            println("$number number Fibonacci")
            withTimeout(1000) {
                try {
                    println(Fibonacci.take(number))
                } catch (e : TimeoutCancellationException) {
                    println("TimeOut one")
                }
            }
        }
        val twoCor = launch {
            val number = 48
            println("$number number Fibonacci")
            withTimeout(6000) {
                try {
                    println(Fibonacci.take(number))
                } catch (e : TimeoutCancellationException) {
                    println("TimeOut two")
                }
            }
        }
        val threeCor = launch {
            val number = 50 //Random.nextInt(1000, 2000)
            println("$number number Fibonacci")
            withTimeout(6000) {
                try {
                    println(Fibonacci.take(number))
                } catch (e : TimeoutCancellationException) {
                    println("TimeOut three")
                }
            }
        }
        if (oneCor.isActive || twoCor.isActive || threeCor.isActive) {
            this.launch(Default) {
                delay(7000)
                println(".")
            }
        } else {
            this.cancel()
        }
        launch {
        delay(7100)
        if (oneCor.isActive || twoCor.isActive || threeCor.isActive) println(".")
        else println("Cancel")}
    }
}
