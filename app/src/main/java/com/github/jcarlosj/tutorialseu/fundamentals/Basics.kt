package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    print( "FORMA 1: \n  for ( number in 1..10 ) \n    " )
    for ( number in 1..10 ) {
        print( "$number, " )
    }
    println()

    print( "FORMA 2 (until): \n  for ( i in 1 until 10 ) \n    " )
    for ( i in 1 until 10 ) {
        print( "$i, " )
    }
    println()

    print( "FORMA 2 (downTo): \n  for ( i in 10 downTo 1 ) \n    " )
    for ( i in 10 downTo 1 ) {
        print( "$i, " )
    }
    println()

    print( "FORMA 3 (until/step): \n  for ( i in 1 until 10 step 2 ) \n    " )
    for ( i in 1 until 10 step 2 ) {
        print( "$i, " )
    }
    println()

    print( "FORMA 3 (downTo/step): \n  for ( i in 10 downTo 1 step 2 ) \n    " )
    for ( i in 10 downTo 1 step 2 ) {
        print( "$i, " )
    }
    println()

    print( "FORMA 4 (until/step): \n  for ( i in 1 until( 20 ) step( 2 ) ) \n    " )
    for ( i in 0 until( 20 ) step( 2 ) ) {
        print( "$i, " )
    }
    println()

    print( "FORMA 5 (downTo/step): \n  for ( i in 10.downTo( 0 ).step( 2 ) ) \n    " )
    for ( i in 20.downTo( 0 ).step( 2 ) ) {
        print( "$i, " )
    }
    println()

}