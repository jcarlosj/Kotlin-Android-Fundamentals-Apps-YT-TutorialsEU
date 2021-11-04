package com.github.jcarlosj.tutorialseu.fundamentals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0

        /** Obtiene referencia de los componentes del Activity */
        val btnAdd = findViewById<Button>( R .id .buttonAdd )
        val tvCounter = findViewById<TextView>( R .id .tvCounter )

        /** Establece un evento sobre el componente de boton */
        btnAdd .setOnClickListener {
            counter += 1                                //  Incrementa el valor
            Log.d( "Add", counter .toString() )     //  Despliega el resultado en la terminal
            tvCounter .text = counter .toString()       //  Despliega el resultado dentro del componente de TextView
        }
    }
}