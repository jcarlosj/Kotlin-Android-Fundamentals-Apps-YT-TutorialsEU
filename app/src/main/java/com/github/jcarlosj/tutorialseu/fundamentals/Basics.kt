package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    var counter: Int = 0
    var total: Float = 0.0f
    var average: Float = 0.0f
    var value: Float

    println( "Promedio de N notas, entre 0 a 5. Digite un numero menor de 0 para salir" )
    repeat( 50 ){
        print( "=" )
    }
    println()

    do{
        print( "Ingrese nota #${ counter + 1 }: " )
        value = readLine()!! .toFloat()

        if( value > 0 && value <= 5 ) {
            total += value
            counter ++
        }
        else if( value > 5 ) {
            println( "  > ERROR: La nota no esta en el rango esperado" )
        }
    } while( value >= 0 )

    average = ( ( total / counter ) .toFloat() )
    println( "El promedio de las $counter notas ingresadas es: $average" )
}