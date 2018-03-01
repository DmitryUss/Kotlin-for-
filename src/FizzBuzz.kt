fun main(args: Array<String>) {
    fun fizzBuzz(i: Int) = when {           //с помощью оператора when(Switch в java) выбираем нужный результат
        i % 15 == 0 -> "Fuzz-Buzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> "$i"
    }
    // for (i in 1..100)
    for (i in 100 downTo 1 step 2) {       // for отличается от java!!! обычного for тут нет
        print(fizzBuzz(i) + " ")
    }
}