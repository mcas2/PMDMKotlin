package Tema2

fun main () {

    var a = 4
    var aInv = -4
    var b = 7
    var pos = 2

    println("The bit result of ($a and $b) is ${ a and b }")
    println("The bit result of ($a or $b) is ${ a or b}")
    println("The bit result of ($a xor $b) is ${ a xor b }")
    println("The bit inversion of $a is ${a.inv()}")
    println("The bit shift left -shl- of $a, $pos positions is ${a.shl(pos)}")
    println("The bit shift right -shr- of $a, $pos positions is ${a.shr(pos)}")
    println("The bit shift right -ushr- (not taking into account the complement) of $aInv, $pos positions is ${aInv.ushr(pos)}")
}