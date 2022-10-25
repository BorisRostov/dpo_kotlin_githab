class Team {

    val CaptainchanceToGet = 40
    val GeneralchanceToGet = 10

    var team = mutableListOf<AbstractWarrior>()

    fun creatingteam(size: Int) : MutableList<AbstractWarrior> {

        for (i in 1..size) {
            if (GeneralchanceToGet.chance()) {
                team.add(General())
                continue
            }
            else if (CaptainchanceToGet.chance()) {
                team.add(Captain())
                continue
            } else team.add(Soldier())
        }
        return team
    }
}
