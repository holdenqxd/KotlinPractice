package kt_base

fun main() {
    println("Введите строку:")
    val input: String? = readLine()

    val length = input?.length
    if (length != null) {
        println("Длина введенной строки: $length")
    } else {
        println("Введена пустая строка или null.")
    }
}