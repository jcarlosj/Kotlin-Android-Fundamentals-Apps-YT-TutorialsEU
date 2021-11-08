package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    /** Nullable: Es la capacidad que le damos a una variable de poder almacenar un valor nulo
     *            para darle esta capacidad a las variables o constantes en Kotlin debemos hacer uso de ? al declarar su tipo (ver linea 11) */

    val label: String = "Android say:"
    var message : String = "$label Hola! te preguntaré, pero no me respondas \n             ¿Cómo te llamas? "     //  Define variable de tipo nulo sin capacidad de albergar un valor nulo

    print( message )
    var name : String? = readLine()         //  Se declara name como una variable de tipo String Nullable anteponiendole al tipo el signo ?

    if( name!!.isEmpty()) {                 //  !! a diferencia del ? convierte cualquier valor en un tipo no nulo y lanza una excepción NPE (NullPointerException) si el valor es nulo
        name = null
        println( "$label Sin nombre el valor ahora será establecido como '${ name }'" )
    } else {
        println( "$label Hola ${ name?.uppercase() }! La idea era que no contestaras." )            // Con ? valida si name es null para posteriormente convertir a mayusculas
    }

    val size = name?.let { it.length }      // Con ? valida si name no es null, posteriormente condiciona el resultado, si no es null mostrará su longitud
    if( size != null )
        println( "Tu nombre tiene ${ size } caracteres." )
}