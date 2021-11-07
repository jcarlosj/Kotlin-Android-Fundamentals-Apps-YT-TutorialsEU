package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    // Aritmetic operators (+, -, *, /, %)
    val seis = 6
    val tres = 3

    /** Suma */
    var result = seis + tres                    //  Infiere el tipo Int

    println( "Operaciones Aritmeticas" )
    println( " - $seis + $tres = $result" )

    /** División */
    result /= 2                                 //  Solo Asigna la parte Entera del resultado
    println( " - $seis + $tres / 2 = $result" )

    /** Resta */
    result -= 1
    println( " - ( $seis + $tres / 2 ) - 1 = $result ")

    /** Multiplicación */
    result *= 3
    println( " - (( $seis + $tres / 2 ) - 1 ) * 3 = $result")

    /** Módulo */
    var residuo = result % 2
    println( " - residuo: $residuo" )

}