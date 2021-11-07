package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    println( "Android say: ¿Cómo te llamas?: " )
    print( "Me: " )
    val name = readLine()

    println( "Android say: Hola $name, ¿Cuál es tu edad?: " )
    print( "Me: " )
    val age = readLine()!! .toInt()

    // Condicional como expresion
    var message = if( age < 17 ) "Android say: Vamos, Quiero invitarte a un helado! "
                  else "Android say: Vamos, Quiero invitarte a una cerveza! "

    print( message )
}