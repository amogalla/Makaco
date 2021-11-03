package com.example.makaco

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MetodoPagoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metodo_pago)

        val terminos = findViewById<CheckBox>(R.id.cbTerminos)
        val usuarioPaypal = findViewById<EditText>(R.id.usuarioPaypal)
        val clavePaypal = findViewById<EditText>(R.id.clavePaypal)
        val num_tarjeta = findViewById<EditText>(R.id.editTextTarjeta)
        val caducidad = findViewById<EditText>(R.id.editTextCaducidad)
        val CVV = findViewById<EditText>(R.id.editTextCVV)
        val btnConfirmarMetodoPago = findViewById<Button>(R.id.btnConfirmarMetodoaPago)

        val botonTarjeta = findViewById<RadioButton>(R.id.rbTarjeta)
        val botonPaypal = findViewById<RadioButton>(R.id.rbPaypal)

        var textoToast:String = ""

        botonTarjeta.setOnClickListener(){
            usuarioPaypal.setVisibility(View.INVISIBLE)
            clavePaypal.setVisibility(View.INVISIBLE)
            num_tarjeta.setVisibility(View.VISIBLE)
            caducidad.setVisibility(View.VISIBLE)
            CVV.setVisibility(View.VISIBLE)
        }

        botonPaypal.setOnClickListener(){
            usuarioPaypal.setVisibility(View.VISIBLE)
            clavePaypal.setVisibility(View.VISIBLE)
            num_tarjeta.setVisibility(View.INVISIBLE)
            caducidad.setVisibility(View.INVISIBLE)
            CVV.setVisibility(View.INVISIBLE)
        }

        usuarioPaypal.setOnClickListener(){
            usuarioPaypal.setText("")
        }
        clavePaypal.setOnClickListener(){
            clavePaypal.setText("")
        }
        num_tarjeta.setOnClickListener(){
            num_tarjeta.setText("")
        }
        caducidad.setOnClickListener(){
            caducidad.setText("")
        }
        CVV.setOnClickListener(){
            CVV.setText("")
        }

        btnConfirmarMetodoPago.setOnClickListener(){
            textoToast = ""
            if (!terminos.isChecked()) { //Si no está aceptado -> error
                Toast.makeText(
                    applicationContext,
                    "Debe aceptar los términos del servicio",
                    Toast.LENGTH_SHORT
                ).show()

            }
            if(botonTarjeta.isChecked()) {
                textoToast += "Pago con tarjeta"
                when (num_tarjeta.text.toString().first()) {
                    '3' -> textoToast += " American Express."
                    '4' -> textoToast += " Visa."
                    '5' -> textoToast += " Mastercard."
                }

            }
            else textoToast += "Pago por Paypal."

            Toast.makeText(
                applicationContext,
                textoToast,
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}