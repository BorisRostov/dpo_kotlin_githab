import kotlin.random.Random

fun main() {
    val myNatureReserve = NatureReserve()
    myNatureReserve.currenzoo =
        (myNatureReserve.animal + myNatureReserve.fish + myNatureReserve.bird + myNatureReserve.dog) as MutableList<Animal>

    for (i in 1..2){
        myNatureReserve.currenzoo.forEach {
        when ((0..4).random()) {
            0 -> it.info()
            1 -> {  it.eat()
                    it.info() }
            2 -> {  it.move()
                    it.info() }
            3 -> {
                it.sleep()
                it.info() }
            4 -> {
                var child = it.newchild()
                child.let {
                    myNatureReserve.childzoo.add(child)
                } } } } }

    myNatureReserve.currenzoo.forEach {
        if (it.isTooOld) myNatureReserve.deathzoo.add(it)
    }

    println(myNatureReserve.currenzoo)
    println(myNatureReserve.deathzoo)
    println(myNatureReserve.childzoo)
    myNatureReserve.currenzoo.removeAll(myNatureReserve.deathzoo)
    println(myNatureReserve.currenzoo + myNatureReserve.childzoo)

}






        /*

       myNatureReserve.currenzoo = (myNatureReserve.animal + myNatureReserve.fish + myNatureReserve.bird + myNatureReserve.dog) as MutableList<Animal>
    println(myNatureReserve.currenzoo)
    println(myNatureReserve.deathzoo)
    myNatureReserve.currenzoo.removeAll(myNatureReserve.deathzoo)


   fun NatureReserve(). {
        Animal.forEach {
            when (Random.nextInt(1, 5)) {
                1 -> it.eat()
                2 -> it.sleep()
                3 -> it.move()
                4 -> if (it.isTooOld) {currenzoo.add(it.newchild())}
            }
        }
    }
    fun randomAction() {
        Animal.forEach {
            when (Random.nextInt(1, 5)) {
                1 -> it.eat()
                2 -> it.sleep()
                3 -> it.move()
                4 -> if (it.isTooOld) {currenzoo.add(it.newchild())}
            }
        }
    } */


    /* var reserv = NatureReserve().zoo
    reserv.forEach{it ->
        var child = it.offspring()
        reserv = (reserv + listOf(child)).toMu
    fun cukl() {
        var zoo = NatureReserve().currenzoo
        var childzoo = NatureReserve().childzoo
    for (i in 1..5)
        zoo.forEach {
            when ((0..3).random()) {
                0 -> it.info()
                1 -> {it.eat()
                    it.info()}
                2 -> { it.move()
                    it.info()}
                3 -> { it.sleep()
                    it.info()}
                4 -> { childzoo.forEach { it ->
                        var child = it.newchild()
                        childzoo = (childzoo + listOf(child)).toMutableList() } } } }
    }



    }*/
