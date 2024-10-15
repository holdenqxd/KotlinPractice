package kt_base

fun main() {
    println("Введите число для обратного отсчета:")
    val input = readLine()

    val countdownStart = input?.toIntOrNull()

    if (countdownStart != null && countdownStart > 0) {
        for (i in countdownStart downTo 1) {
            println(i)
            Thread.sleep(1000)
        }
        println("Старт!")
    } else {
        println("Некорректное значение. Пожалуйста, введите положительное число.")
    }
}