
import kotlin.random.Random

class Soldier: AbstractWarrior() {
    override var health : Int = 50
    override var accuracy: Int = 75
    override var weapon : AbstractWeapon = Weapon.automatic

    override var isKilled = false
    override var dodChance = 5
}