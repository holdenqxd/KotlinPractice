package kt_base

fun main() {

    println("Введите элементы списка через запятую:")
    val input = readLine() ?: return

    val elements = input.split(",").map { it.trim() }

    val elementCount = elements.groupBy { it }.mapValues { it.value.size }

    println("Количество вхождений элементов:")
    for ((key, value) in elementCount) {
        println("$key: $value")
    }
}