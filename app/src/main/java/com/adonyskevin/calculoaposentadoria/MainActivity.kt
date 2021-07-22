package com.adonyskevin.calculoaposentadoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        val edt_idade = findViewById<EditText>(R.id.edt_idade)
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        spn_sexo.adapter = ArrayAdapter<String>(this,  android.R.layout.simple_spinner_dropdown_item, listOf("Masculino", "Feminino"))
    }
}