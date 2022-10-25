import kotlin.*

enum class Ammo(
    var mainDamage: Int,
    private var criticalDamageChance: Int,
    private var criticalDamageCoefficient : Int,

) {
    Patron1(2, 25, 5),
    Patron2(3, 20, 4),
    Patron3(4, 15, 5);

    fun currentDamage() : Int {
        val currentDamage : Int = if (criticalDamageChance.chance()) {
            mainDamage * criticalDamageCoefficient
        } else {
            mainDamage
        }
        return currentDamage
    }

}
