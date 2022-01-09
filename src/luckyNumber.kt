fun main() {
    val num = getNum()
    println(isLucky(num))
}

private fun getNum(): Int {
    println("Введите четырехзначное число: ")
    val num: Int
    val inp = readLine()

    num = if (inp != null && inp.length == 4) {
        try {
            inp.toInt()
        } catch (e: NumberFormatException) {
            print("Ошибка! ")
            getNum()
        }
    } else {
        print("Ошибка! ")
        getNum()
    }

    return num
}

private fun isLucky(num: Int): Boolean {
    val first:Int = num / 1000
    val second:Int = num % 1000 / 100
    val third:Int = num % 100 / 10
    val fourth: Int = num % 10

    return first + second == third + fourth
}