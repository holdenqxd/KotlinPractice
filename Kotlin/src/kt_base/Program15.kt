package kt_base

fun main() {
    println("Введите длину массива:")
    val originalSize = readLine()?.toIntOrNull()

    if (originalSize != null && originalSize > 0) {
        val originalArray = IntArray(originalSize)

        println("Введите $originalSize чисел:")
        for (i in 0 until originalSize) {
            originalArray[i] = readLine()?.toIntOrNull() ?: 0
        }
        val reversedArray = IntArray(originalSize)
        for (i in originalArray.indices) {
            reversedArray[i] = originalArray[originalSize - 1 - i]
        }
        println("Новый массив в обратном порядке:")
        for (i in reversedArray) {
            println(i)
        }
    } else {
        println("Некорректное значение. Пожалуйста, введите положительное число.")
    }
}