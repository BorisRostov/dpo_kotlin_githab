sealed class BatleState(val inf: String) {

    object team1vin : BatleState("Team 1 WIN")
    object team2vin : BatleState("Team 2 WIN")
    object draw : BatleState("Draw")
}


//    else if (team1.size < team2.size) println("Team 2 WIN")
//    else println("Draw")



//    fun info1 (team1: MutableList<AbstractWarrior>, team2 : MutableList<AbstractWarrior>){
//        println("Team 1  ")
//        team1.forEach { it -> print(" $it - ${it.health }") }
//        println()
//        println("Team 2  ")
//        team2.forEach { it -> print(" $it - ${it.health }") }
//        println()