package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    val sofia = Person( "Sofia", "Gutiérrez" )

    sofia.hobby = "leer"
    sofia.stateHobby()

    val juan = Person( "Juan", "Jiménez", 43 )
    val manu = Person( "Manuela", "Gómez", 29 )

    manu.stateHobby()

    println( "\nData Class" )
    println( sofia.toString() )
    println( juan.toString() )
    println( manu.toString() )

    println( "\nCantidad de '${ Person.getInfo() }' creadas es de: ${ Person.COUNTER }" )
}

/** OOP - Data Class */
data class Person constructor( var firstName: String, var lastName: String, var age: Int? = null ) {
    /** Dinamic members or Member variables (Properties or Attributes) */
    var hobby: String = "dormir"

    init {
        println( "Persona '$firstName, $lastName $age' creada!" )
        Person.COUNTER ++
    }

    /** Secondary Constructor */
    constructor( firstName: String, lastName: String ) : this ( firstName, lastName, 0 ) {
        println( "Persona '$firstName, $lastName $age' creada!" )
    }

    /** Static Members */
    companion object {
        /** Member Variables (Properties or Attributes) */
        var COUNTER = 0

        /** Member function (Methods) */
        fun getInfo () : String {
            return "Personas"
        }
    }

    /** Member function (Methods) */
    fun stateHobby() {
        println( " > Say: Mi hobbie es ${ hobby }" )
    }

}