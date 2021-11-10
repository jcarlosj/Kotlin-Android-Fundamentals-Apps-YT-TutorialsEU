package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    val sofia = Person( "Sofia", "Gutiérrez" )

    sofia.hobby = "leer"
    sofia.stateHobby()

    val juan = Person( "Juan", "Jiménez", 43 )
    juan.stateHobby()

    val manu = Person( "Manuela", "Gómez", 29 )
    manu.stateHobby()

    println( "\nData Class" )
    println( sofia.toString() )
    println( juan.toString() )
    println( manu.toString() )

    println( "\nCantidad de '${ Person.getInfo() }' creadas es de: ${ Person.COUNTER }" )
}

/** OOP - Data Class */
data class Person constructor( var firstName: String, var lastName: String ) {
    /** Dinamic members or Member variables (Properties or Attributes) */
    var age: Int? = null
    var hobby: String = "dormir"

    init {
        println( "Persona '$firstName, $lastName $age' creada! (Main Constructor)" )
        Person.COUNTER ++
    }

    /** Secondary Constructor */
    constructor( firstName: String, lastName: String, age: Int ) : this ( firstName, lastName ) {
        this .age = age
        println( "Persona '$firstName, $lastName, $age' creada!  (Secondary Constructor)" )
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
        println( " > ${ this .firstName } say: Mi hobbie es ${ this .hobby }" )
    }

    override fun toString(): String {
        return "Person( firstName: ${ this .firstName }, lastName: ${ this .lastName }, age: ${ this .age } )"
    }

}