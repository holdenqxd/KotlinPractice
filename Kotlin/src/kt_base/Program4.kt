package kt_base
fun main() {
    println("Введите символ в нижнем регистре:")
    val input = readLine() ?: return

    if (input.isNotEmpty() && input[0].isLowerCase()) {
        val upperChar = input[0].uppercaseChar()
        val unicodeCode = upperChar.code

        println("Символ в верхнем регистре: $upperChar")
        println("Код Unicode нового символа: $unicodeCode")
    } else {
        println("Пожалуйста, введите допустимый символ в нижнем регистре.")
    }
}
