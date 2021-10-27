package Tema2

fun main() {
    var lista = Array<Int> (100){10}
    for (i in 0 until 100){
         lista[i]=(0..100).random()
    }
    var max : Int = -1
    var min : Int = 101

    for (i in 0 until 100){
        if (lista[i]>max) max = lista[i]
        if (lista[i]<min) min = lista[i]
    }
    println(lista.contentToString())
    println("El máximo es $max")
    println("El mínimo es $min")

    var a = 10
    var b = 5
    println(sumar(a, b))

}

fun sumar (a : Int, b: Int) : Int = a+b
