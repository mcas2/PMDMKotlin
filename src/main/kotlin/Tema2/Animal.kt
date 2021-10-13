package Tema2

data class Animal (var edad: Byte, var peso: Short, var sexo: Char, var pais: String)

fun main () {
    var animal : Animal = Animal(3, 4, 'M', "Bielorrusia")
    println(animal.toString())
}