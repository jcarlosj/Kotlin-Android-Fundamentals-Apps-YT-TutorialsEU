package com.github.jcarlosj.tutorialseu.fundamentals

fun main() {
    // Integer numbers                                             Mínimo                          Máximo
    var numberOne: Byte = 1               //                         -128                            +127      (8 bits)
    var numberTwo: Short = 25_000         //                      -32 768                         +32 767      (16 bits)
    var numberThree: Int = 8_950_000      //               -2 147 483 648                  +2 147 483 647      (32 bits)
    var numberFour: Long = 7_834_234_000  //   -9 223 372 036 854 775 808      +9 223 372 036 854 775 807      (64 bits)
    // NOTA: Podemos usar el guion bajo para separar por miles una cantidad y poder visualizarla mejor

    println( "Integer numbers" )
    println( " - Byte:  " + numberOne )
    println( " - Short: " + numberTwo )
    println( " - Int:   " + numberThree )
    println( " - Long:  " + numberFour )

    // Decimal numbers
    var decimalNumberOne: Float = 5.34f                  //  (32 bits)
    var decimalNumberTwo: Double = 5.576456842233021     //  (64 bits)

    println( "Decimal numbers" )
    println( " - Float:  " + decimalNumberOne )
    println( " - Double: " + decimalNumberTwo )

    // Booleans
    var isSunny: Boolean = true

    println( "Booleans (Boolean)" )
    println( " - Sunny : " + isSunny )
    println( " - Not sunny: " + ! isSunny )

    // Characters
    var digitChar: Char = '9'
    var letterChar: Char = 'J'
    var symbolChar: Char = '$'

    println( "Characters (Char)" )
    println( " - Digit : " + digitChar )
    println( " - Letter: " + letterChar )
    println( " - Symbol: " + symbolChar )

    // Characters
    var message: String = "Hello World!"

    println( "String" )
    println( " > " + message )
    println( " - length: " + message .length )
    println( " - first character: " + message[ 0 ] )
    println( " - last character: " + message[ message.length - 1 ] )
}