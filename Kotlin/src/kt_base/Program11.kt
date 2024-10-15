package kt_base

fun main() {
    println("Введите число от 1 до 7:")
    val input = readLine()

    val dayOfWeek = input?.toIntOrNull()

    when (dayOfWeek) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Некорректное значение. Пожалуйста, введите число от 1 до 7.")
    }
}