package Tema2

data class Animal (var nombre: String, var edad: Byte, var peso: Short, var sexo: Char, var pais: String)

fun main () {
    var oso : Animal = Animal ("Oso",3, 4, 'M', "Bielorrusia")
    println(oso.toString())
}