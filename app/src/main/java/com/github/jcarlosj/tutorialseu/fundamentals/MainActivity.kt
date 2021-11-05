package com.github.jcarlosj.tutorialseu.fundamentals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var tag = "none"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Obtiene referencia de los componentes del Activity */
        val btnAdd = findViewById<Button>( R .id .buttonAdd )
        val btnSubtract = findViewById<Button>( R .id .buttonSubtract )
        val btnReset = findViewById<Button>( R .id .buttonReset )
        val tvCounter = findViewById<TextView>( R .id .tvCounter )

        /** Establece un evento sobre el componente de boton */
        btnAdd .setOnClickListener {
            this .counter += 1                                //  Incrementa el valor
            showData( tvCounter, "Incrementa" )
        }

        /** Establece un evento sobre el componente de boton */
        btnSubtract .setOnClickListener {
            this .counter = if( this .counter <= 0 ) 0 else this .counter - 1           //  Decrementa el valor, solo si no es menor que CERO
            showData( tvCounter, "Decrementa si > 0" )
        }

        /** Establece un evento sobre el componente de boton */
        btnReset .setOnClickListener {
            this .counter = 0                                    //  Asigna cero al valor
            showData( tvCounter, "Inicializa" )
        }
    }

    private fun showData( tvCounter: TextView, message: String ) {
        Log.d( this .tag, this .counter .toString() )      //  Despliega el resultado en la terminal
        tvCounter .text = this .counter .toString()        //  Despliega el resultado dentro del componente de TextView
        Toast.makeText( this, message, Toast .LENGTH_LONG ) .show()
    }
}