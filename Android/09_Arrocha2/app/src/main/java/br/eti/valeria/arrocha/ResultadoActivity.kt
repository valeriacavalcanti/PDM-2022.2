package br.eti.valeria.arrocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if (intent.hasExtra("JOGO")){
            val jogo = intent.getSerializableExtra("JOGO") as Arrocha

            Toast.makeText(this, jogo.getStatus().toString(), Toast.LENGTH_SHORT).show()
        }
    }
}