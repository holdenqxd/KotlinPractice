package kt_base

fun main() {
    val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()

    println("Введите количество элементов первого множества:")
    repeat(readLine()?.toIntOrNull() ?: return) {
        set1.add(readLine()?.toIntOrNull() ?: 0)
    }

    println("Введите количество элементов второго множества:")
    repeat(readLine()?.toIntOrNull() ?: return) {
        set2.add(readLine()?.toIntOrNull() ?: 0)
    }

    val unionSet = set1 union set2
    println("Объединение двух множеств:")
    println(unionSet.joinToString(", "))
}