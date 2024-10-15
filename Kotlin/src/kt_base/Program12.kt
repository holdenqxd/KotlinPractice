package kt_base

fun main() {
    println("Введите число (n):")
    val input = readLine()


    val n = input?.toIntOrNull()

    if (n != null && n > 1) {
        for (i in 1 until n) {
            println(i * 2)
        }
    } else {
        println("Некорректное значение. Пожалуйста, введите число больше 1.")
    }
}