package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    println( "Android say: Dame un nombre con S, por favor " )
    print( "Me: " )
    var name = readLine()
    name = name?.lowercase()

    // When (Es como switch para otros lenguajes)
    when( name ) {
        "sofia" ->                            // Pasamos cada uno de los valore validos
            println( "${ name } es un nombre muy bonito" )
        "sandra", "sonia", "susana" ->                               // Pasamos un rango
            println( "${ name } es el nombre de una chica" )
        "sandro", "sebastian", "sergio" ->                             // Pasamos un rango
            println( "${ name } es el nombre de un chico" )
        else    -> println( "Hey! $name es un nombre que no conozco" )

    }
}