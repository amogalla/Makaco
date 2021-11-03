package com.example.makaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ConfirmacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        val textoDisplay = intent.getStringExtra("Bono")
        val textView = findViewById<TextView>(R.id.textoConfirmacion).apply {
            text = textoDisplay
        }

        val botonConfirmar = findViewById<Button>(R.id.btnConfirmar)
        val botonCancelar = findViewById<Button>(R.id.btnCancelar)

        botonConfirmar.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Pago", "Métodos de pago")

            startActivity(intent)
        }

        botonCancelar.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Pago", "Métodos de pago")

            startActivity(intent)
        }


    }
}