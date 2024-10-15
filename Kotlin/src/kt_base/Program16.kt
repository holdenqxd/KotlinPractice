package kt_base

fun main() {
    println("Введите длину списка:")
    val size = readLine()?.toIntOrNull() ?: return

    val originalList = mutableListOf<String>()

    println("Введите $size элемента(ов) списка:")
    repeat(size) {
        originalList.add(readLine() ?: "")


        val uniqueList = originalList.distinct()


        println("Уникальные элементы в оригинальном порядке:")
        uniqueList.forEach { println(it) }
    }
}
