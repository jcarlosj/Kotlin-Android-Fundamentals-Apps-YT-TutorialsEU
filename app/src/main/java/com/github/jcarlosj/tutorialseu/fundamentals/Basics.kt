package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    println( "Android say: ¿Cómo te llamas?: " )
    print( "Me: " )
    val name = readLine()

    println( "Android say: Hola $name, ¿Cuál es tu edad?: " )
    print( "Me: " )
    val age = readLine()!! .toInt()

    if( age > 17 ) {
        println( "Android say: Puedo preguntarte ¿Cuánto mides?: ")
        print( "Me: " )
        val size = readLine()!! .toFloat()

        println( "Android say: Ok, Juan. Mides $size y tienes $age años, Excelente!")
    }

    println( "Android say: Vaya! $age años es una buena edad para aprender" )

}