package kt_base

fun main() {
    println("Введите число:")
    val input = readLine()

    val number = input?.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("Число четное")
        } else {
            println("Число нечетное")
        }
    } else {
        println("Введено некорректное значение")
    }
}