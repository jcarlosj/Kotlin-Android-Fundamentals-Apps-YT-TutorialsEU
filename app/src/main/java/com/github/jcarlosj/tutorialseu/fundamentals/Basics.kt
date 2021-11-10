package com.github.jcarlosj.tutorialseu.fundamentals

import java.lang.IllegalArgumentException

fun main() {
    val taxi = Car()
    taxi .maxSpeed = 150
    println( "Propietaria: ${ taxi .owner } \nMarca: ${ taxi .brand } \nMax Speed: ${ taxi .maxSpeed }" )
    //taxi .model = "M5"                  //  No se puede acceder por que el Custom Setter indica que es private
    println( "Model: ${ taxi .model }")
    taxi.makeImprovement()
    println( "Model: ${ taxi .model }")
}

/** OOP - Data Class */
class Car() {
    lateinit var owner: String      //  lateinit: Permite indicarle que inicializaremos en otro momento
    var brand: String = "BMW"
    get() {                         /** Custom Getter to brand */
        return field.lowercase()
    }

    var maxSpeed: Int = 250
    get() = field                   /** Custom Getter to brand: en este caso seria redundante ya que si no la definimos igual la retorna como se establecio (Podría eliminar esta linea) */
    set( value ) {                  /** Custom Setter to brand */
        field = if( value > 0 ) value else throw IllegalArgumentException( "La velocidad máxima no puede ser menor de 0" )
    }

    var model: String = "M5"
    private set                     /** Solo esta disponible dentro de la clase */

    init {
        this .owner = "Luisa"       //  Si no se hace la inicializacion al acceder al dato owner (linea 5) se lanzara una Exception
    }

    fun makeImprovement() {
        this.model += "-Improved"
    }
}