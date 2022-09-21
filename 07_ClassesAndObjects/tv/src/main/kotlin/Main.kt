import java.nio.channels.Channel
import kotlin.random.Random

fun main() {
    var samsung = tv("Samsung", "a41", 24.5)
    var philips = tv("Philips", "2154", 21.0)
    var lg = tv("LG", "q15", 25.0)

    println("Choosing a TV brand: 1 - Samsung, 2 - Philips, 3 - LG")

    var vibor = readln()
    var viborUser = tv("-", "-", 0.0)

    when (vibor) {
        "1" -> viborUser = samsung
        "2" -> viborUser = philips
        "3" -> viborUser = lg
        else -> {
            println("incorrect TV selection")
            exit()
        }
    }
    println(
        """
        You have chosen: ${viborUser.brand} model: ${viborUser.model} diagonal: ${viborUser.diagonal}
        This TV has ${viborUser.channel.size} channels.
    """.trimIndent())
    println("Following channels:")
    viborUser.channel.forEachIndexed { index, item -> println("Number $index - channel $item") }
    println(
        """To turn on the TV, press the * button or the desired channel
to switch channels, use the chat command or + and -
To switch the volume, the " vol " command and the value to which you want to change"""
    )

    while (!viborUser.status ) {
        viborUser.click(readln())
    }
    while (true) {
        viborUser.click(readln())
    }
}
fun exit(){
    return main()
}













    /*

        vibor = readln()
    when {
        vibor == "vol" ->  {
            if (viborUser.status) {
                viborUser.vol(readln().toInt())
            } else println("TV OFF")
        }
        vibor == "*" -> {
            viborUser.statustrue()
            viborUser.pereklchannel("0")
            println("VOLUME ${viborUser.volume}")
        }
        vibor == "**" -> viborUser.statusfalse()
        vibor == "***" -> exit()
        vibor.toIntOrNull() in viborUser.channel.indices -> {
            viborUser.statustrue()
            viborUser.pereklchannel(vibor)
            println("VOLUME ${viborUser.volume}")
        }
        else -> println("Need to enable TV")
    }



    when {
        v1.toInt() in viborUser.channel.indices -> {viborUser.vk(v1.toInt())}

        v1.toString() == "*" -> {
        viborUser.statustrue()
        println("Turned on ${viborUser.channel[0]}")}


        else -> println("Need to enable TV")


    }
    println(viborUser.volume)

    v1 = readln()
    if (v1 == "vol") viborUser.vol(readln().toInt())
    else if (v1.toInt() in viborUser.channel.indices) viborUser.viborchannel(v1)
    else if (v1 == "**") viborUser.statusfalse()
    v1 = readln()
    if (v1 == "vol") viborUser.vol(readln().toInt())
    else if (v1.toInt() in viborUser.channel.indices) viborUser.viborchannel(v1)
    else if (v1 == "**") viborUser.statusfalse()
    v1 = readln()
    if (v1 == "vol") viborUser.vol(readln().toInt())
    else if (v1.toInt() in viborUser.channel.indices) viborUser.viborchannel(v1)
    else if (v1 == "**") viborUser.statusfalse()


*/

    /* if (v1 == "vol") { viborUser.volume
        viborUser.vol(readln().toInt())
    }
    else if (v1 == "*" || v1.toInt() in viborUser.channel.indices) viborUser.vk(v1)
    else println("Need to enable TV")*/


