import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow

fun main(args : Array<String>) {
    var numberPlayers : Int
    do {
        println("Enter the number of lotto players:")
        numberPlayers = readLine()?.toIntOrNull() ?: return
    } while (numberPlayers <= 0)

    println("Enter the number of cards:")
    val cardsCount : Int = readln().toInt()                                // ?.toIntOrNull() ?: return
    val team = mutableListOf<Players>()

    for (i in 1..numberPlayers) {
        println("Enter the player's name:")
        Players(readln(), cardsCount).let { team.add(it) }
    }
    team.forEach {
        println("The player ${it.name} has cards:")
        it.createCardPlayers()
    }
    runBlocking {
        team.forEach { playersNames ->
            launch {
                Generator.flow.collect { number ->
                    println("A barrel with a number $number")
                    delay(100)
                    playersNames.getNumber(number)
                    println("${playersNames.name} closed numbers are - ${playersNames.winNumCoun}")
                    if (playersNames.winNumCoun == cardsCount * 15) {
                        println("--------- Win ${playersNames.name} -----------------")
                        cancel()
                    }
                }
            }
        }
    }
}
object Generator {
    var flow = (1..90).shuffled().asFlow()
}









//Распространите данные между этими классами и объектами с помощью различных flow. Выберите наиболее подходящий вариант под эту задачу.
//Программа должна выполняться в соответствии с описанными правилами и имитировать игру нескольких игроков. Уделите особое внимание следующим пунктам:
//производство данных (передача данных во flow) должно прекратиться после победы одного из игроков;
//все коллекторы должны отписываться от flow, то есть перестать получать данные после победы одного из игроков;
//программа должна корректно завершаться, все корутины должны завершить свое выполнение.