package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    /** Declaracion de un espacio de memoria inmutable (Constante) */
    val year = 2021

    /** Declaracion de un espacio de memoria mutable (Variable) */
    var name = "Juan"
    println( "Hola " + name + ", estamos en el año " + year )

    name = "Sofia"
    print( "Hola ${ name }, estamos en el año ${ year }" )
}