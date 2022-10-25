import kotlin.random.Random

class General: AbstractWarrior() {
    override var health : Int = 100
    override var accuracy: Int = 95
    override var weapon = Weapon.pistol

    override var isKilled : Boolean = false
    override var dodChance : Int = 20
}