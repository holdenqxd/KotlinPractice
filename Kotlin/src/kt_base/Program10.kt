package kt_base

fun main() {
    println("Введите возраст:")
    val input = readLine()


    val age = input?.toIntOrNull()

    when {
        age == null || age < 0 -> println("Некорректный возраст")
        age in 0..12 -> println("Ребёнок (от 0 до 12 лет)")
        age in 13..17 -> println("Подросток (от 13 до 17 лет)")
        age in 18..64 -> println("Взрослый (от 18 до 64 лет)")
        age >= 65 -> println("Пожилой (65 лет и старше)")
        else -> println("Некорректный возраст")
    }
}