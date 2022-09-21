import kotlin.random.Random

object Chan {
    private val chanlist: List<String> = listOf("Perviy", "NTV", "Premier", "STS", "TNT", "DISCOVERI", "FOX")

    fun getRandomChannels(): List<String>  {
        var a = Random.nextInt(chanlist.size)
        if (a < 3 ) a = 3
        return MutableList(a){ item -> chanlist[item] }.shuffled()
    }

}