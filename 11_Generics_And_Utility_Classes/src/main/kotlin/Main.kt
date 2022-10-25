
fun main() {
    println("Team size ")
    var size = readln().toInt()
    var team1 = Team().creatingteam(size)
    var team2 = Team().creatingteam(size)

    println("Number of rounds ")
    val rounds = readln().toInt()

    for (i in 1..rounds) {
        println("Round $i")
        Battle().info1(team1)
        Battle().info1(team2)
        Battle().round(team1, team2)
    }

}

fun Int.chance() : Boolean {
    val randomNum = (1..100).random()
    return this >= randomNum
}
//if (team1.size > team2.size) println("Team 1 WIN")
//else if (team1.size < team2.size) println("Team 2 WIN")
//else println("Draw")