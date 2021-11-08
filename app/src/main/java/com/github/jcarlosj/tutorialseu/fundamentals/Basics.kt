package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    var counter: Int = 4
    var total: Float = 0.0f
    var average: Float = 0.0f
    var value: Float

    println( "Promedio de 4 notas, entre 0 a 5" )
    while( counter != 0 ) {
        print( "Ingrese nota ${ 5 - counter }: " )
        value = readLine()!! .toFloat()

        if( value > 0 && value <= 5 ) {
            total += value
            counter -= 1
        }
        else {
            println( "  > ERROR: La nota no esta en el rango esperado" )
        }

    }

    average = ( ( total / 4 ) .toFloat() )
    println( "El promedio de las 4 notas es: $average" )
}