package br.eti.valeria.ifurna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    private lateinit var etNome: EditText
    private lateinit var etNumero: EditText
    private lateinit var btSalvar: Button
    private lateinit var btCancelar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        this.etNome = findViewById(R.id.etFormNome)
        this.etNumero = findViewById(R.id.etFormNumero)
        this.btSalvar = findViewById(R.id.btFormSalvar)
        this.btCancelar = findViewById(R.id.btFormCancelar)

        Log.i("CICLO", "OnCreate - Form")

        if (intent.hasExtra("MSG_IDA")){
            val msg = intent.getStringExtra("MSG_IDA")
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }

        this.btSalvar.setOnClickListener { salvar() }
        this.btCancelar.setOnClickListener { cancelar() }
    }

    private fun salvar(){
        val nome = this.etNome.text.toString()
        val numero = this.etNumero.text.toString().toInt()
        val candidato = Candidato(nome, numero)
        val intent = Intent().apply {
            putExtra("CANDIDATO", candidato)
        }
        setResult(RESULT_OK, intent)
        finish()
    }

    private fun cancelar(){
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO", "OnStart - Form")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO", "OnResume - Form")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO", "OnPause - Form")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLO", "OnStop - Form")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CICLO", "OnRestart - Form")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO", "OnDestroy - Form")
    }
}