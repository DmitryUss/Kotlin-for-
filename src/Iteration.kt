import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()            //Словарь TreeMap хранит ключ в порядке сортировки
    for (c in 'A'..'F'){                                //Обход диапазона символов A..F
        val binary = Integer.toBinaryString(c.toInt())  //Преобразует ASCII код в двоичное представлкение
        binaryReps[c] = binary                          //Сохроняет значение с ключом "c"
    }

    for ((Letter, binary) in binaryReps ){              //Обход элементов словоря и вывод значений
        println("$Letter = $binary" )
    }
}