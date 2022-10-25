import java.util.Stack

object Weapon {
    val pistol: AbstractWeapon = createPistol()
    val gunner: AbstractWeapon = createGunner()
    val automatic: AbstractWeapon = createAutomatic()

    fun createPistol() : AbstractWeapon {
        return object : AbstractWeapon(
            maxAmmo = 7,
            fireType = FireType.SingleShot
        ) {
            override fun creatingPatron() : Ammo = Ammo.Patron1
        }
    }

    fun createGunner() : AbstractWeapon {
        return object : AbstractWeapon(
            maxAmmo = 60,
            fireType = FireType.MultiShot(5)
        ) {
            override fun creatingPatron() : Ammo = Ammo.Patron3
        }
    }

    fun createAutomatic() : AbstractWeapon {
        return object : AbstractWeapon(
            maxAmmo = 30,
            fireType = FireType.MultiShot(3)
        ) {
            override fun creatingPatron() : Ammo = Ammo.Patron2
        }
    }
}