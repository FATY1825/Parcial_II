package com.example.parcial_ii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val guardar:Button = btnar
        val mostrar:Button = btnmost

        @Suppress("DEPRECATION")
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)

        guardar.setOnClickListener{
            val name:String = etxnom.text.toString()
            val type:String = etxtip.text.toString()
            val pray:String = etxraz.text.toString()
            val vac:String = etxvac.text.toString()

            val editor = prefs.edit()
            editor.putString("key1", "Tipo de Mascota: $type")
            editor.putString("key2", "Nombre de la Mascota: $name")
            editor.putString("key3", "Raza del Animal: $pray")
            editor.putString("Key4", "Tipo de Vacuna: $vac")
            editor.apply()

            Toast.makeText(this,"Los cambios han sido guardado",LENGTH_LONG).show()
        }
        mostrar.setOnClickListener{
            val intent = Intent(this, data::class.java).apply {

            }
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.info -> {
                val intent = Intent(this, members::class.java).apply {

                }
                startActivity(intent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}