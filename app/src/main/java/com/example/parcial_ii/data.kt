package com.example.parcial_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_data.*


class data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val type1: TextView = txtypema
        val name1: TextView = txtnamema
        val pray1: TextView = txtvacun

        @Suppress("DEPRECATION")
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)

        val a = prefs.getString("key1", "Tipo de Mascota: Dato inexistente ")
        val b = prefs.getString("key2", "Nombre de la Mascota: No se encuentra el dato ")
        val c = prefs.getString("key3", "Raza del Animal: No se encuentra el dato ")


        type1.text = a
        name1.text = b
        pray1.text = c

    }
}