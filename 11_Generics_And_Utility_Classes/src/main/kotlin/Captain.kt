import kotlin.random.Random

class Captain:  AbstractWarrior() {
    override var health : Int = 80
    override var accuracy : Int = 85
    override var weapon = Weapon.gunner

    override var isKilled : Boolean = false
    override var dodChance : Int = 10
}


