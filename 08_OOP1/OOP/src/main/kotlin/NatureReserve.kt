class NatureReserve {

    val b1_parrot = Bird("parrot", 4, 5,25)
    val b2_pigeon = Bird("pigeon", 3, 1)
    val b1_penguin = Bird("penguin", 4, 5,18)
    val b1_eagle= Bird("eagle", 4, 5,15)
    val b1_hawk = Bird("hawk", 4, 3,21)

    val d1_bulldog = Dog("bulldog", 6, 20,12)
    val d2_beagle = Dog("beagle", 2, 3,30)

    val f1_shark = Fish("shark", 2, 3,8)
    val f2_herring = Fish("herring", 2, 3,8)
    val f3_tuna = Fish("tuna", 2, 3,12)

    val a1_wolf = Animal("wolf", 4, 3,5)
    val a2_bear = Animal("bear", 2, 3,15)
    val a3_hare = Animal("hare", 2, 3)

    var zoo = mutableListOf<Animal>(a1_wolf, a2_bear, a3_hare, d1_bulldog, d2_beagle, f1_shark, f2_herring, f3_tuna, b1_parrot, b2_pigeon, b1_penguin, b1_eagle, b1_hawk)
    var deathzoo = mutableListOf<Animal>()
    var childzoo = mutableListOf<Animal>()
}