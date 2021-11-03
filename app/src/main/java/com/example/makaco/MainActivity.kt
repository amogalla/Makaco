package com.example.makaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonComprarBono = findViewById<Button>(R.id.btnComprarBono)
        val botonMetodoPago = findViewById<Button>(R.id.btnMetodoPago)
        val botonLibre = findViewById<Button>(R.id.btnLibre)

        botonComprarBono.setOnClickListener(){
            val intent1 = Intent(this, ComprarBonoActivity::class.java)
            intent1.putExtra("Bono", "Bonos extra")

            startActivity(intent1)
        }

        botonMetodoPago.setOnClickListener(){
            val intent3 = Intent(this, MetodoPagoActivity::class.java)
            intent3.putExtra("Pago", "Métodos de pago")

            startActivity(intent3)
        }


        botonLibre.setOnClickListener(){
            val intent1 = Intent(this, LibreActivity::class.java)
            intent1.putExtra("Menu", "Suscripción dada de baja.")

            startActivity(intent1)

        }

    }
}