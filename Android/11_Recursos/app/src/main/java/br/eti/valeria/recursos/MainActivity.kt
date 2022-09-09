package br.eti.valeria.recursos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btHtml: Button
    private lateinit var btDiscar: Button
    private lateinit var btLigar: Button
    private lateinit var btCompartilhar: Button
    private lateinit var btEmail: Button
    private lateinit var btPonto: Button
    private lateinit var btRota: Button
    private lateinit var btSMS: Button
    private lateinit var btYoutube: Button
    private lateinit var btFoto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btHtml = findViewById(R.id.btHTML)
        this.btDiscar = findViewById(R.id.btDiscar)
        this.btLigar = findViewById(R.id.btLigar)
        this.btCompartilhar = findViewById(R.id.btCompartilhar)
        this.btEmail = findViewById(R.id.btEmail)
        this.btPonto = findViewById(R.id.btPonto)
        this.btRota = findViewById(R.id.btRota)
        this.btSMS = findViewById(R.id.btSms)
        this.btYoutube = findViewById(R.id.btYoutube)
        this.btFoto = findViewById(R.id.btFoto)

        this.btHtml.setOnClickListener { Html() }
        this.btDiscar.setOnClickListener { Discar() }
        this.btLigar.setOnClickListener { Ligar() }
        this.btCompartilhar.setOnClickListener { Compartilhar() }
        this.btEmail.setOnClickListener { Email() }
        this.btPonto.setOnClickListener { Ponto() }
        this.btRota.setOnClickListener { Rota() }
        this.btSMS.setOnClickListener { SMS() }
        this.btYoutube.setOnClickListener { Youtube() }
        this.btFoto.setOnClickListener { Foto() }
    }

    private fun Html(){
        val uri = Uri.parse("http://www.ifpb.edu.br")
        val intent = Intent(Intent.ACTION_VIEW, uri)

        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }
    }

    private fun Discar(){
    }

    private fun Ligar(){
    }

    private fun Compartilhar(){
    }

    private fun Email(){
    }

    private fun Ponto(){
    }

    private fun Rota(){
    }

    private fun SMS(){
    }

    private fun Youtube(){
    }

    private fun Foto(){
    }
}