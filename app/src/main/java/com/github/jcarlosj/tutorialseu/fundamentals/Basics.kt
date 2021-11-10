package com.github.jcarlosj.tutorialseu.fundamentals

import java.lang.IllegalArgumentException

/** OOP - Data Class: No pueden ser open/abstract (inherit/abstract) */
data class User( val id: Long, var username: String )

fun main() {
    val elisa = User( 1, "Elisa")
    val luisa = User( 1, "Luisa" )

    println( " > ${ elisa.toString() }" )   //  Imprime detalle de la data del objeto usando toString()
    println( " > ${ luisa.toString() }" )   //  Imprime detalle de la data del objeto usando toString()
    println( "El obj 'elisa' es igual al obj 'luisa': ${ elisa .equals( luisa ) }"  )


    println( "\nCambia el nombre de elisa a 'Luisa'" )
    elisa.username = "Luisa"
    println( " > ${ elisa }" )              //  Imprime detalle de la data del objeto sin usar toString()
    println( " > ${ luisa }" )              //  Imprime detalle de la data del objeto sin usar toString()
    println( "El obj 'elisa' es igual al obj 'luisa': ${ elisa == luisa } \n"  )

    val juliana = elisa .copy( username = "Juliana" )   // Copia el objeto y reasigna valor al atributo username
    println( " > ${ juliana }" )            //  Imprime detalle de la data del objeto sin usar toString()
    println( "El obj 'elisa' es igual al obj 'juliana': ${ elisa == juliana }" )

    println( "\nImprime componentes de un objeto (usando component)")
    println( " > ${ juliana::class.simpleName}( id: ${ juliana.component1() }, username: ${ juliana.component2() } )" )

    /** Deconstruccion (Desestructuracion) */
    println( "\nDeconstruccion de un objeto")
    val ( id, username ) = juliana;
    println( "id: $id, username: $username ")
}
