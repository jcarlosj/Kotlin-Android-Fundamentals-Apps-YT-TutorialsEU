package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    println( "Android say: ¿Cómo te llamas?: " )
    print( "Me: " )
    val name = readLine()

    println( "Android say: Hola $name, ¿Cuál es tu edad?: " )
    print( "Me: " )
    val age = readLine()!! .toInt()

    // When (Es como switch para otros lenguajes)
    when( age ) {
        1, 2, 3, 4, 5 ->                            // Pasamos cada uno de los valore validos
            println( "Wow! Eres tan solo un pequeño" )
        in 6 .. 17 ->                               // Pasamos un rango
            println( "Vamos a comer un helado" )
        in 18 .. 100 ->                             // Pasamos un rango
            println( "Vamos, ya tienes edad para una cerveza" )
        else    -> println( "Hey! Nadie tiene $age años" )

    }
}