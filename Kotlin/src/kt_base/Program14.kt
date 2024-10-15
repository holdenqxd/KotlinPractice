package kt_base

fun main() {
    println("Введите число для поиска:")
    val searchNumber = readLine()?.toIntOrNull()

    println("Введите количество элементов массива:")
    val size = readLine()?.toIntOrNull()
    if (size != null && size > 0) {
        val numbers = IntArray(size)

        println("Введите $size чисел:")
        for (i in 0 until size) {
            numbers[i] = readLine()?.toIntOrNull() ?: 0
        }

        val contains = searchNumber != null && searchNumber in numbers
        println(contains)
    } else {
        println("Некорректное количество элементов массива.")
    }
}