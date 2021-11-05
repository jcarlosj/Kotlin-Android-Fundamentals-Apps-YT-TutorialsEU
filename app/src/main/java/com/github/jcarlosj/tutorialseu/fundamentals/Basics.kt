package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    /** Declaracion de un espacio de memoria inmutable (Constante) */
    val year = 2021                     //  Infiere el tipo

    /** Declaracion de un espacio de memoria mutable (Variable) */
    var firstName = "Juan"              //  Infiere el tipo
    var lastName:String = "Jimenez"     //  Define variable de tipo String
    println( "Hola " + firstName + " " + lastName + ", estamos en el año " + year )

    firstName = "Sofia"
    lastName = "Gutierrez"
    print( "Hola ${ firstName } ${ lastName }, estamos en el año ${ year }" )
}