package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    println( "Android say: ¿Cómo te llamas?: " )
    print( "Me: " )
    val name = readLine()

    println( "Android say: Hola $name, ¿Cuál es tu edad?: " )
    print( "Me: " )
    val age = readLine()!! .toInt()

    // Condicional como expresion
    var message = if( age <= 0 ) "Hey! Nadie tiene $age años"
                  else if( age < 5 ) "Wow! Eres tan solo un pequeño"
                  else if( age < 17 ) "Vamos a comer un helado"
                  else "Vamos, ya tienes edad para una cerveza"

    print( "Android say: $message!" )
}