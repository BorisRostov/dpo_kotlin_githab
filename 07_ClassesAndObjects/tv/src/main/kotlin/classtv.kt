import kotlin.random.Random

class tv(var brand: String, var model: String, var diagonal: Double) {

    var status = false
        set(value) {
            if (!value) println("TV OFF")
            else println("TV ON")
            field = value
        }
    lateinit var currentchannel: String

    var channel = Chan.getRandomChannels()

    var volume: Int = (minvolume..maxvolume).random()
        set(value) {
            println("VOLUME $value")
            field = value
        }
    private fun vol(n: Int) {
        volume += n
        if (volume >= maxvolume) volume = maxvolume
        else if (volume <= minvolume) volume = minvolume
        volume
    }
    fun pereklchannel(v: String){
        var a = v.toInt()
        currentchannel = channel[a]
    println("the TV shows $currentchannel")
    }
    fun statusfalse() {
        status = false
    }
    fun statustrue() {
        status = true
    }
    fun click(a: String) {
        when {
            a == "vol" ->  {
                if (status) {
                    vol(readln().toInt())
                } else println("TV OFF")
            }
            a == "*" -> {
                statustrue()
                pereklchannel("0")
                println("VOLUME $volume")
            }
            a == "+" -> {
                if (currentchannel == channel.last()) currentchannel = channel.first()
                else currentchannel = channel[channel.indexOf(currentchannel)+1]
                println("the TV shows $currentchannel")
                println("VOLUME $volume")
            }
            a == "-" -> {
                currentchannel = if (currentchannel == channel.first()) channel.last()
                else channel[channel.indexOf(currentchannel)-1]
                println("the TV shows $currentchannel")
                println("VOLUME $volume")
            }
            a == "**" -> statusfalse()
            a == "***" -> exit()
            a.toIntOrNull() in channel.indices -> {
                statustrue()
                pereklchannel(a)
                println("VOLUME $volume")
            }
            else -> println("Need to enable TV")
        }
    }
    companion object {
        const val maxvolume: Int = 100
        const val minvolume: Int = 0
    }
}














/*

        if (readln() == "*") status = true
        else {status = false
            println("To turn on the TV, press *")}
        return statusTurn()



        var s = readln()
        if (s == "*")
включение/выключение;
увеличение громкости на заданную величину;
уменьшение громкости на заданную величину;
переключение канала на заданный (аналог нажатия кнопки с цифрой канала на пульте);
если телевизор выключен, то использование этой функции включает телевизор и переключает канал на заданный;
переключение каналов в порядке возрастания и убывания (аналог нажатия кнопок переключения каналов «Вверх» и «Вниз» на пульте); если телевизор выключен, то использование этих функций включает телевизор на канале, который был до выключения; переключение каналов непрерывно: после последнего канала включается первый из списка;
представление списка каналов в виде
п
о
р
я
д
к
о
в
ы
й
н
о
м
е
р
название_канала для отображения.
MutableList(Random.nextInt(chanlist.size)) {item -> chanlist[item]}

включение/выключение;
увеличение громкости на заданную величину;
уменьшение громкости на заданную величину;
переключение канала на заданный (аналог нажатия кнопки с цифрой канала на пульте); если телевизор выключен, то использование этой функции включает телевизор и переключает канал на заданный;
переключение каналов в порядке возрастания и убывания (аналог нажатия кнопок переключения каналов «Вверх» и «Вниз» на пульте); если телевизор выключен, то использование этих функций включает телевизор на канале, который был до выключения; переключение каналов непрерывно: после последнего канала включается первый из списка;
представление списка каналов в виде $порядковый_номер — $название_канала для отображения.



        chanlist.forEachIndexed{index, s -> println("$index chanel $s") }
        println("Channel is ${channel - 1} - ${chanlist[channel]}")
        Random.nextInt(chanlist.size)

    fun turnOn(): Boolean {
    if (status) {
        status = true
        val brand
        println("The $brand TV is on")}
    else println("The $brand TV is off")
return status

    }*/







