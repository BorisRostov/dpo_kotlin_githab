fun main() {
    val firstName = "Boris" //  именем.
    val lastName = "Trifonov" //  фамилией.
    var height = 172.5
    var weight = 79.6f
    var isChild: Boolean = height < 150 || weight < 40  // 150 см или вес меньше 40 кг.
    var info = """   
        firstName - $firstName
        lastName - $lastName
        height - $height
        weight - $weight
        isChild - $isChild
    """.trimIndent()
    println(info)
    println()
    height = 100.5
    isChild = height < 150 || weight < 40
    info = """   
        firstName - $firstName
        lastName - $lastName
        height - $height
        weight - $weight
        isChild - $isChild
    """.trimIndent()
    println(info)
}