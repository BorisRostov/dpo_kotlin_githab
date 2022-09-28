import kotlin.random.*

class Bird: Animal {
    constructor(name: String, energy: Int, weight: Int, maxage: Int = 30) :
            super(name, energy, weight, maxage)
    override var currentage: Int = Random.nextInt(1..5)

    override fun move() {
        energy -= if (energy <= 5) {
            println("$name NOT energy for flies")
            return
        } else 5
        weight -= 1
        tryIncrementAge()
        println("$name flies")
    }
    override fun newchild(): Bird {
        var child = Bird(
            name = this.name,
            energy = (1..10).random(),
            weight = (1..5).random(),
            maxage = this.maxage)
        child.currentage = 0
        println("$name birth")
        child.info()
        return child
    }
}

