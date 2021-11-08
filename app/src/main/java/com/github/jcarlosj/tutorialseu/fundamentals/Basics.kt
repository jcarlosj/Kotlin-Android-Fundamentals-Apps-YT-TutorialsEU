package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    print( "Iterar de 1 a 20, solo imprimir hasta el 9 \n  usando break \n    " )
    for ( number in 1..20 ) {
        if( number / 2 == 5 ) {
            break
        }
        print( "$number, " )
    }
    println()

    print( "Iterar de 1 a 20, sin imprimir los pares \n  usando continue \n    " )
    for ( number in 1..20 ) {
        if( number % 2 == 0 ) {
            continue
        }
        print( "$number, " )
    }
    println()

}