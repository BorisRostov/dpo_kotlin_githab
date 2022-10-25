interface Warrior {
    var isKilled: Boolean
    var dodChance: Int
    var health : Int

    fun attack(enemyWarrior : Warrior)
    fun takeDamage(damage: Int)

    fun info() {
        println("$this health ${this.health}")
    }
}