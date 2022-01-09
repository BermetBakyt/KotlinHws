fun main() {
    val num1 = getInt()
    val op = getOperation()
    val num2 = getInt()

    val res = calc(num1, op, num2)
    println("Результат операции: $res")
}

private fun getInt(): Int {
    print("Введите число: ")

    val num: Int
    val inp:String? = readLine()

    num = if (inp != null && inp != "") {
        try {
            inp.toInt()
        } catch (e: NumberFormatException) {
            print("Ошибка. ")
            getInt()
        }
    } else {
        getInt()
    }

    return num
}

private fun getOperation(): Char {
    print("Введите операцию: ")

    val op: Char
    val inp:String? = readLine()
    if (inp != null && inp != "") {
        return inp.first()
    } else {
        print("Введите операцию: ")
        op = getOperation()
    }

    return op
}

private fun calc(num1:Int, op:Char, num2:Int): Int {
    return when (op) {
        '+' -> {
            num1 + num2
        }
        '-' -> {
            num1 - num2
        }
        '/' -> {
            if (num2 == 0) {
                println("На ноль делить нельзя. Попробуйте снова. ")
                calc(getInt(), getOperation(), getInt())
            } else {
                num1 / num2
            }
        }
        '*' -> {
            num1 * num2
        }
        else -> {
            print("Операция некорректна. ")
            calc(num1, getOperation(), num2)
        }
    }
}