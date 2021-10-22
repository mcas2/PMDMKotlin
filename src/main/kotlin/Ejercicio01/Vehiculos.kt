package Ejercicio01


open class Vehiculo (var numBastidor: Int, var matricula: String?, var tipoCombustible: String,
                    var precio: Double)

class VehiculoComercial (numBastidor: Int, matricula: String?, tipoCombustible: String, precio: Double,
                         var empresa : String, var ocupantes : Int?, var carga : Int?):
    Vehiculo(numBastidor, matricula, tipoCombustible, precio)

fun main () {
    var coche1 = Vehiculo (2141, "6060DCK", "Gasolina", 5000.0)

    println(coche1)
    println("El coche con matrícula ${coche1.matricula} ha subido 100 euros de precio: ")
    coche1.precio = subirPrecio(coche1.precio, 100.0)
    println(coche1)
    println("Subimos el precio 200 euros de forma genérica")
    coche1.precio = subirPrecio(coche1.precio)
    println(coche1)

    var cocheCom1 : VehiculoComercial = VehiculoComercial(2, "2315adf","Gasolina", 3000.0,
        "Coprinsa", 400, 4000)
    println("Primer vehículo privado: ")
    println(cocheCom1)

    var a = 17
    println(a.inv())     //SUMAR 1 y PONERLO NEGATIVO
    println(a.shr(2))
}

fun subirPrecio (precio: Double, subida : Double = 200.0) : Double {
    return subida + precio
}



