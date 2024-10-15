package kt_base

fun main() {
    println("Введите ваш возраст:")
    val input = readLine()


    val age = input?.toIntOrNull()

    when {
        age == null || age < 0 -> println("Введено некорректное значение")
        age >= 18 -> println("Совершеннолетний")
        else -> println("Несовершеннолетний")
    }
}