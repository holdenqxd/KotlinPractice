package kt_base

fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""


    if (input.length >= 2) {
        val firstTwoChars = input.take(2)
        val modifiedString = input.drop(2) + firstTwoChars
        println("Результат: $modifiedString")
    } else {
        println("Строка слишком короткая, чтобы удалить два символа.")
    }
}
