
import java.lang.NumberFormatException


fun main() {

    val animals = Animals.animals
    var exit = false

    while (!exit) {
        print("Please enter the number of the habitat you would like to view or EXIT if you want to leave Zoo: ")
        val input = readln().trimIndent()

        try {
            when {
                input.toInt() in animals.indices -> println(animals[input.toInt()])
                else -> println("You entered the wrong symbol. Try again!")
            }
        } catch (e: NumberFormatException) {
            if (input.equals("EXIT", ignoreCase = true)) {
                println("See you later!")
                exit = true
            } else {
                println("You entered the wrong symbol. Try again!")
            }
        }
    }
}




