package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    // Comparison operators (==, !=, <, >, <=, >=)
    var isEqual = 9 == 9
    println( "9 == 9 : $isEqual" )

    // String Interpolations
    println( "9 != 9 : ${ 9 != 9 }" )
    println( "9 > 9 : ${ 9 > 9 }" )
    println( "9 < 9 : ${ 9 < 9 }" )

    isEqual = "Juan" == "Juan"
    println( "\"Juan\" == \"juan\" : $isEqual" )
    
}