package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    val audiCar = Car( "A3", "Audi" )
    val teslaCar = ElectricCar( "S-Model", "Tesla", 85.0 )

    audiCar.drive( 100.0 )
    audiCar.extendRange( 50.0 )
    print( ", rango: ${ audiCar .range } km \n" )

    teslaCar.drive( 100.0 )
    teslaCar.extendRange( 100.0 )
    print( ", rango: ${ teslaCar .range } km \n" )
}

/** OOP - Herencia de clases: Por defecto las clases en Kotlin son definidas como final, esto evita que puedan ser usadas por otras.
 *  open: es una propiedad que elimina la definicion predetermindad de final y la hace accesible y extendible */
open class Car( val name: String, val brand: String ) {
    var range: Double = 0.0

    fun extendRange( amount: Double ) {
        if( amount > 0 )
            range += amount
    }

    fun drive( distance: Double ) {
        print( "${ javaClass.simpleName } condujo por: $distance km" )
    }

}

/** Clase Hija que hereda o extiende de la clase padre Vehicle */
class ElectricCar( name: String, brand : String, batteryLife: Double ) : Car( name, brand ) {

}