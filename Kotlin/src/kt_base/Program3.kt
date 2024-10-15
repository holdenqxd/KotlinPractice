package kt_base
    fun main() {
        println("Введите первый символ:")
        val firstChar = readLine() ?: return
        println("Введите второй символ:")
        val secondChar = readLine() ?: return

        if (firstChar.isNotEmpty() && secondChar.isNotEmpty()) {
            val firstCharCode = firstChar[0].code
            val secondCharCode = secondChar[0].code
            val difference = firstCharCode - secondCharCode

            println("Unicode первого символа: $firstCharCode"); println("Unicode второго символа: $secondCharCode")
            println("Разность Unicode кодов: $difference")
        } else {
            println("Пожалуйста, введите допустимые символы.")
        }
    }
