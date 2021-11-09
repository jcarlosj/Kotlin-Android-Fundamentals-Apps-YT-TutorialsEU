package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    /** Nullable: Es la capacidad que le damos a una variable de poder almacenar un valor nulo
     *            para darle esta capacidad a las variables o constantes en Kotlin debemos hacer uso de ? al declarar su tipo (ver linea 11) */

    val label: String = "Android say:"
    var message : String = "$label Hola! te preguntaré, pero no me respondas \n             ¿Cómo te llamas? \nMe: "     //  Define variable de tipo nulo sin capacidad de albergar un valor nulo

    print( message )
    var name : String? = readLine()                     //  1. Declara name como String Nullable
    name = if( name!!.isEmpty() ) null else name        //  2. Assertion operator !! convierte cualquier variable a tipo no nulo y lanza una excepción NPE (NullPointerException) si el valor es nulo

    /** Elvis Operator ?: */
    name = name ?: "Invitado"            // Si el valor de name es null va a asignarle una cadena por defecto

    println( "$label Hola $name! Bienvenido." )

}