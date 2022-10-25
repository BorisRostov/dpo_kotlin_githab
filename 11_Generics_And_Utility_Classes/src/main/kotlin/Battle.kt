import BatleState
class Battle {


    fun round(team1: MutableList<AbstractWarrior>, team2 : MutableList<AbstractWarrior>){

        if ((1..2).random() / 2 == 0) {
            println("The starts Team 1")
            udar(team1, team2)
        } else {
            println("The starts Team 2")
            udar(team2, team1)
        }
        info2(team1.size, team2.size)
    }

    fun udar(team1 : MutableList<AbstractWarrior>, team2 : MutableList<AbstractWarrior>) {

        for (i in 0 until team1.size) {
            println("${team1[i]} patronov ${team1[i].weapon.magazine.stack.size} attack")
            team1[i].attack(team2.random())
            team2.filter { it.isKilled }.forEach { team2.remove(it) }
        }
        println("Retaliatory strike")
        for (i in 0 until team2.size) {
            println("${team2[i]} patronov ${team2[i].weapon.magazine.stack.size} attack")
            team2[i].attack(team1.random())
            team1.filter { it.isKilled }.forEach { team1.remove(it) }
        }
    }

    fun info1(team: MutableList<AbstractWarrior>) {
        println("Team")
        team.forEach { it -> print(" $it - ${it.health}")}
        println()
    }

    fun info2(a: Int, b: Int) {
        if (a > b)  println(BatleState.team1vin.inf)
        else if (a < b) println(BatleState.team2vin.inf)
        else println(BatleState.draw.inf)
    }
}