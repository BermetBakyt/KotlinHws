fun main() {

    while (true) {
        print("Введите любое число: ")
        val inp = readLine()

        val num = if (inp == null) {
            continue
        } else {
            try {
                inp.toInt()
            } catch (e: NumberFormatException) {
                continue
            }
        }

        println("Количество цифр в веденном числе - ${amountOfNums(num)}. (у/ы)")

        println("Продолжить? (у) - да, любые другие клавиши - нет.")
        val cont = readLine()!!.toString()
        if (cont != "y" && cont != "Y") {
            break
        }
    }
}

fun amountOfNums(n: Int): Double = if (n / 10 < 1) 1.0 else 1 + amountOfNums(n / 10)