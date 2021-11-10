package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    val taxi = Car()
    println( "La propietaria es: ${ taxi .owner }" )
}

/** OOP - Data Class */
class Car() {
    lateinit var owner: String      //  lateinit: Permite indicarle que inicializaremos en otro momento

    init {
        this .owner = "Luisa"       //  Si no se hace la inicializacion al acceder al dato owner (linea 5) se lanzara una Exception
    }
}