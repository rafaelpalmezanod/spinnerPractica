package com.example.spinner


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import kotlinx.coroutines.newFixedThreadPoolContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insertarValor = findViewById<EditText>(R.id.ediText)
        val botonEnviar = findViewById<Button>(R.id.button)
        val spinner = findViewById<Spinner>(R.id.spinner)
        var lista =  mutableListOf<String>()

        botonEnviar.setOnClickListener {
         //val almacenar = insertarValor.text.toString().trim()
            lista.add(insertarValor.text.toString().trim())
            var listAdapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
            listAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter=listAdapter
        }
        }
    }




