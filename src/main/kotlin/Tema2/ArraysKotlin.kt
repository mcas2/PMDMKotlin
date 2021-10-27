package Tema2

fun main() {
    var size : Int = 10
    var lista = Array<Int> (size){0}

    for (i in 0 until size){
        lista[i] = (0..100).random()
    }
    println(lista.contentToString())

    var num1 : Int = (0..100).random()
    var num2 : Int = (0..100).random()
    var num3 : Int = (0..100).random()
}