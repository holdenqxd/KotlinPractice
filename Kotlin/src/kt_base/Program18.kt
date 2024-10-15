package kt_base

fun main() {
    val set1 = mutableSetOf<Int>()
    val set2 = mutableSetOf<Int>()


    println("Введите количество элементов первого множества:")
    val n = readLine()!!.toInt()
    println("Введите элементы первого множества (по одному на строку):")
    repeat(n) {
        set1.add(readLine()!!.toInt())
    }

    println("Введите количество элементов второго множества:")
    val m = readLine()!!.toInt()
    println("Введите элементы второго множества (по одному на строку):")
    repeat(m) {
        set2.add(readLine()!!.toInt())
    }

    val intersection = set1.intersect(set2)

    println("Общие элементы двух множеств:" + intersection.joinToString(", "))
}