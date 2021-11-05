package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    var firstName = "Sofia"
    var lastName = "Gutierrez"

    println( "Hola, " + firstName + " " + lastName + ", tu nombre tiene " + firstName.length + " letras."  )     // Concatenacion de variables y strings
    println( "Hola, ${ firstName } ${ lastName }, tu nombre tiene ${ firstName.length } letras." )               // Interpolacion de variables y strins
    println( "Hola, $firstName $lastName, tu nombre tiene ${ firstName.length } letras." )                       // Interpolacion de variables y strins

}