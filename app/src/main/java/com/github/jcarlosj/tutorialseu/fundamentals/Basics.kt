package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    // Assignment operators (+=, -=, *=, /=, %=)
    var result = 0

    println( "Increment (++) / Decrement (--)" )
    println( "result: $result" )

    // Increment
    println( "  result++: ${ result++ }" )
    println( "  ++result: ${ ++result }" )

    println( "result: $result" )

    // Decrement
    println( "  result--: ${ result-- }" )
    println( "  --result: ${ --result }" )
}