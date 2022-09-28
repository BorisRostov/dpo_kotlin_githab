import kotlin.random.*

open class Animal (val name: String,
                   var energy: Int,
                   var weight: Int,
                   var maxage: Int = 20,
                   ) {
    open var currentage: Int = Random.nextInt(1..5)
    var isTooOld = currentage >= maxage

    fun eat() {
        energy += 3
        weight += 1
        tryIncrementAge()
        println("$name eat")
    }

    fun sleep() {
        energy += 5
        currentage += 1
        println("$name sleep")
    }

    open fun move() {
        energy -= if (energy <= 5) {
            println("$name NOT energy for move")
            return}
        else 5
        weight -= 1
        tryIncrementAge()
        println("$name move")
    }
    fun tryIncrementAge() {
        if (Random.nextBoolean())
            currentage++
    }
    open fun newchild(): Animal {
        val child = Animal(
            name = this.name,
            energy = (1..10).random(),
            weight = (1..5).random(),
            maxage = this.maxage)
            child.currentage = 0
        println("$name birth")
        child.info()
        return child
    }

    fun info() = println("Name $name, Energy $energy, Weight $weight, Current age $currentage, Maxage $maxage:")

}



