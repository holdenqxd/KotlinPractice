package kt_base

fun main() {
    println("Введите три числа с плавающей точкой:")

    val num1 = readLine()?.toDoubleOrNull()
    val num2 = readLine()?.toDoubleOrNull()
    val num3 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null || num3 == null) {
        println("Ошибка: пожалуйста, введите корректные числа.")
        return
    }

    val average = (num1 + num2 + num3) / 3

    println("Среднее арифметическое: $average")
}
