import java.util.*

abstract class AbstractWeapon(
    val maxAmmo: Int,
    var fireType: FireType,
    var magazine: Stack<Ammo> = Stack(),
    var isEmpty: Boolean = false
    ) {

    open fun magazineisEmpty() : Boolean {
        isEmpty = fireType.isEmpty(magazine)
        return isEmpty
    }

    abstract fun creatingPatron() : Ammo

    open fun reloadWeapon() {
        for (i in 0 until maxAmmo) {
            magazine.push(creatingPatron())
        }
        magazineisEmpty()
    }



    open fun getAmmo(): Stack<Ammo> {
        val stackForShot : Stack<Ammo> = Stack()
        when (fireType) {
            is FireType.SingleShot-> {
                if (magazineisEmpty())
                    magazine.pop()?.let { stackForShot.push(it) }
            }
            is FireType.MultiShot -> {
                if (magazine.stack.size >= (fireType as FireType.MultiShot).shotlength){
                    for (i in 1..(fireType as FireType.MultiShot).shotlength) {
                        magazine.pop()?.let { stackForShot.push(it) }
                    }
                }
            }
        }
//        magazineisEmpty()
        return stackForShot
    }
}
