package br.eti.valeria.geraldo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var numeros: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // resgatar o objeto texto
        this.numeros = findViewById(R.id.tvNumeros)

        // alterar o texto exibido (6 números aleatórios e distintos)
        this.numeros.text = Megasena().numeros.toString()
    }

}