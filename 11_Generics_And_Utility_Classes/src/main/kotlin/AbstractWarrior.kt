

abstract class AbstractWarrior: Warrior {

    abstract var accuracy : Int                                  // точность
    abstract var weapon : AbstractWeapon

    override fun takeDamage(damage : Int) {
        health -= damage
        isKilled = health <= 0
    }

    override fun attack(enemyWarrior : Warrior) {
        if (!weapon.isEmpty) {
            println("The magazine is empty, reloading and skipping a move")
            weapon.reloadWeapon()
        } else {
            println("Shot")
            weapon.getAmmo().stack.forEach {
                if (accuracy.chance()) {
                    if (enemyWarrior.dodChance.chance()) {
                        println("Dodge")
                    } else {
                        val damage = it.currentDamage()
                        enemyWarrior.takeDamage(damage)
                        enemyWarrior.info()
                        if (damage > weapon.creatingPatron().mainDamage) {
                            println("Damage $damage Critical")
                        }
                    }
                } else println("Missed")
            }
        }
    }

//    fun info() {
//        println("$this health ${this.health}")
//    }
}


//    override fun attack(enemyWarrior : AbstractWarrior) {
//        if (weapon.isEmpty) {
//            println("the magazine is empty, reloading and skipping a move")
//            weapon.reloadWeapon()
//        } else {
//            println("Shot")
//            if (accuracy.chance()) {
//                if (enemyWarrior.dodChance.chance()) {
//                    println("Dodge")
//                } else {
//                    val damage = Ammo(10,12,2).currentDamage()
//                    enemyWarrior.takeDamage(damage)
//                    enemyWarrior.info()
//                    if (damage > weapon.creatingPatron().mainDamage){
//                        print("$damage Crit")
//                    } else print("$damage")}
//            } else println("Missed")
//        }
//    }






//if (weapon.isEmpty) {
//    println("The clip is empty. Reload your weapon")
//    weapon.reloadWeapon()
//}