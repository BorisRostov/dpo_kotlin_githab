class AlfaBank(balance: Int,
               creditlimit: Int,
               creditpart: Int,
               var cashback: Double = 0.05): CreditCard(balance, creditlimit, creditpart) {



    override fun topay(): Boolean {
        var moneyOk: Boolean = false
        val os = balance + creditpart
        val a = readln().toInt()
        if (a <= os) {
            moneyOk = true
            println("The purchase was made in the amount of $a")
            if (balance < a) {
                creditpart -= (a - balance)
                balance = 0
            } else {balance -= a}
            if (a>=5000) balance += (a * cashback).toInt()
            getinfoavailablemoney()
        } else {
            moneyOk = false
            println("Purchase rejected")
            exit()
        }
        return moneyOk

    }

}


/*

Бонусные баллы в размере 1% от покупок.

Потенциальный кэшбэк 5% от покупок при условии трат больше 5 000 тыс.

Накопление в размере 0.005% от суммы пополнений.
Для конкретных дебетовых и кредитных карт скорректируйте функции «Пополнить» и «Оплатить» так, чтобы они учитывали конкретные бонусные программы.
Для конкретных дебетовых и кредитных карт реализуйте функцию «Получение информации обо всех доступных средствах». Функция должна учитывать собственные и кредитные средства, а также соответствующие бонусы.
Проанализируйте получившиеся классы. При необходимости перенесите реализацию функций на уровень выше.
Убедитесь, что все функции ваших классов работают корректно. Для этого создайте экземпляры классов и проверьте работу каждой из описанных функций.
       */
