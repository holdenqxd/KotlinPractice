package kt_base
fun main() {
    println("Введите символ:")
    val input = readLine()

    if (input != null && input.length == 1) {
        val character = input[0]
        val isLetter = character.isLetter()
        println(isLetter)
    } else {
        println("Пожалуйста, введите только один символ.")
    }
}