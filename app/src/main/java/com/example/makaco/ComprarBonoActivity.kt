package com.example.makaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch

class ComprarBonoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprar_bono)

        val switch100MB = findViewById<Switch>(R.id.switch100MB)
        val switch500MB = findViewById<Switch>(R.id.switch500MB)
        val switch5GB = findViewById<Switch>(R.id.switch5GB)
        val switch30min = findViewById<Switch>(R.id.switch30min)
        val switch100min = findViewById<Switch>(R.id.switch100min)
        val botonComprar = findViewById<Button>(R.id.btnComprar)
        var texto:String = "" //Variable que se enviará a la pantalla de confirmación.

        /*switch100MB.setOnClickListener {
            switch500MB.setChecked(false)
            switch5GB.setChecked(false)
        }*/

        botonComprar.setOnClickListener(){
            //Dependiendo de qué switch esté pulsado en INTERNET, actualizamos la variable texto
            if(switch100MB.isChecked())
                texto += "100 MB"
            if(switch500MB.isChecked())
                texto += "500 MB"
            if(switch5GB.isChecked())
                texto += "5 GB"

            //Dependiendo de qué switch esté pulsado EN LLAMADAS, actualizamos la variable texto
            if(switch30min.isChecked())
                texto += " 30 minutos"
            if(switch100min.isChecked())
                texto += " 100 minutos"


            val intent2 = Intent(this, ConfirmacionActivity::class.java)
            intent2.putExtra("Bono", texto)

            startActivity(intent2)
        }
    }
}