import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Input the number of contacts you want to save: ")
    val numOfContacts = scanner.nextInt()

    println("Save the new contacts using next pattern:\n" +
            "<the name of the contact> <their cellphone number>")
    val map = hashMapOf<String, Int>()
    for (i in 0 until numOfContacts) {
        val name = scanner.next()
        val telNum = scanner.nextInt()
        map[name] = telNum
    }

    while (true) {
        print("Input the name of searching contact (or 'exit' to finish program): ")
        val name = scanner.next()
        if (name == "exit") {
            break
        }

        if (map.containsKey(name)) {
            println("$name = ${map[name]}")
        } else {
            println("Not found")
        }
    }

    scanner.close()
}