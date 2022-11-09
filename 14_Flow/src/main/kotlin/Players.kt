class Players (
    val name: String,
    val cardCount: Int ) {
    var winNumCoun = 0
    var cards: MutableList<MutableList<MutableList<Int>>>  = mutableListOf()

    fun createCardPlayers() : MutableList<MutableList<MutableList<Int>>> {
        for (i in 1..cardCount) {        
            cards.add(Cards().card as MutableList<MutableList<Int>>)
        }
        return cards
    }
    fun getNumber(number : Int) {
        val numberRem = mutableListOf<Int>()
        cards.forEach { card ->
            card.forEach { line ->
                line.forEach { item ->
                    if (item != 0 && item == number) {
                        println("win numbers from $name = $number")
                        numberRem.add(item)
                        winNumCoun++
                    }
                }
                line.removeAll(numberRem)
            }
        }
    }
}
