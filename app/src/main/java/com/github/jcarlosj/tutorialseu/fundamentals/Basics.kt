package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    val arepa = Arepa()
    val sofia = Person( "Sofia", "Gutiérrez" )
    val milo = Pet( "Milo", "Criollo" )
    val rex = Pet()
    val marx = Pet( petName = "Marx ")
}

/** OOP - Classes */

// Sin Constructor
class Arepa {
    init {
        println( "Arepa creada!" )
    }
}

// Con Constructor Definido (puede ser publico, private, etc)
class Person constructor( firstName: String, lastName: String ) {
    init {
        println( "Persona '$firstName, $lastName' creada!" )
    }
}

// Con Constructor No Definido y valores por defecto
class Pet( petName: String = "Rex", petBreed: String = "German shepherd" ) {
    init {
        println( "Mascota '$petName, $petBreed' creada!" )
    }
}