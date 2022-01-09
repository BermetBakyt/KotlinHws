fun main() {
    val array = intArrayOf(11, 4, 3, 6, 654, 24, 5, 8)
    val charArray = charArrayOf('c', 'j', 'u', 'a', 'v', 'b', 'b', '3')

    println(array.toList())
    array.bubbleSort()
    println(array.toList())

    println(charArray.toList())
    charArray.bubbleSort()
    println(charArray.toList())
}

fun IntArray.bubbleSort() {
    var sortedEdge = this.size
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 1 until sortedEdge) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sorted = false
            }
        }
        sortedEdge--
    }
}

fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}

fun CharArray.bubbleSort() {
    var sortedEdge = this.size
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 1 until sortedEdge) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sorted = false
            }
        }
        sortedEdge--
    }
}

fun CharArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}