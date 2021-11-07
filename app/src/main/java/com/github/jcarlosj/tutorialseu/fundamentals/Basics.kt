package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    var something: Any = true
    println( ": $something" )

    // When (Es como switch para otros lenguajes)
    when( something ) {
        is Int      -> println( "$something es un 'Int'" )
        is Double   -> println( "$something es un 'Double'" )
        is Float    -> println( "$something es un 'Float'" )
        is String   -> println( "$something es un 'String'" )
        is Boolean  -> println( "$something es un 'Boolean'" )
        else        -> println( "Hey! $something no es un tipo conocido" )
    }
}