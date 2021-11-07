package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    println( "Android say: ¿Cómo te llamas?: " )
    print( "Me: " )
    val name = readLine()

    println( "Android say: Hola $name, ¿Cuál es tu edad?: " )
    print( "Me: " )
    val age = readLine()!! .toInt()

    // When (Es como switch para otros lenguajes)
    when {
        age <= 0 -> println( "Hey! Nadie tiene $age años" )
        age < 5  -> println( "Wow! Eres tan solo un pequeño" )
        age < 17 -> println( "Vamos a comer un helado" )
        else     -> println( "Vamos, ya tienes edad para una cerveza" )

    }
}