
fun main() {
    val cor = runB



    var wheel = Wheel()

    println("pump up the wheel to")
    var pressure = readln().toDouble()
    try {
        var res = wheel.pumpingwheel(pressure)
        println("$wheel pressure $res pressure permissible")
    } catch (t : TooHighPressure) {
        println("pressure unacceptable operation impossible")
    } catch (t : TooLowPressure) {
        println("pressure unacceptable operation impossible")
    } catch (t : IncorrectPressure) {
        println("procedure failed")
    }
}
//         if (t == IncorrectPressure()) println("procedure failed")
//        else println("pressure unacceptable operation impossible")


class TooHighPressure : Throwable ("too high pressure")
class TooLowPressure : Throwable ("too low pressure")
class IncorrectPressure : Throwable ("incorrect pressure: negative or exceeding 10 atmospheres")

class Wheel(var currentpressure: Double = 0.0) {

    fun pumpingwheel(futurepressure : Double) : Double {
        when (futurepressure) {
            in 1.60..2.50 -> {
                currentpressure = futurepressure
                return currentpressure
            }
            in 0.0..1.5999 -> throw TooLowPressure()
            in 2.50001..10.0 -> throw TooHighPressure()
            else -> throw IncorrectPressure()

        }
    }
}

interface Job: CoroutineContext.Element {
    val isActive: Boolean
    val isCom


}




