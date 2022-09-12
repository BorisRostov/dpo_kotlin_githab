fun main() {
    println("enter the number of users")
    var n = 0      // количество пользователей
    do { n = readln().toInt()
        if (n <= 0) println("the number must be greater than 0")
    } while (n <= 0)
    println("""
        enter your username and password
        the password can only contain numbers
    """.trimIndent())
    val tab = hashMapOf<String, Int>()
    for (i in 1..n) { // цикла вводите последовательно в консоль пары логин-пароль.
        tab[readln()] = readln().toInt()}
    println(tab)  // выведите содержимое map в консоль.

    print("Enter login:")
    var user: String = readln()
    print("Enter the password:")
    var pas: Int = readln().toInt()

    if( tab.keys.contains(user) == true && tab[user] == pas)
        println("Welcome $user")
    else println("Invalid username or password is specified")
}