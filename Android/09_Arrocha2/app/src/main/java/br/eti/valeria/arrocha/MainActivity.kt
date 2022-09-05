package br.eti.valeria.arrocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etNumero: EditText
    private lateinit var btArrocha: Button
    private lateinit var arrocha: Arrocha

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // criar novo jogo
        this.arrocha = Arrocha()

        this.etNumero = findViewById(R.id.etMainNumero)
        this.btArrocha = findViewById(R.id.btMainArrocha)

        this.btArrocha.setOnClickListener(OnClickBotao())
    }

    inner class OnClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            var numero = this@MainActivity.etNumero.text.toString().toInt()
            var dica = this@MainActivity.arrocha.jogar(numero)

            if (this@MainActivity.arrocha.getStatus() == Status.EXECUTANDO){
                Toast.makeText(this@MainActivity, dica, Toast.LENGTH_SHORT).show()
            }else {
                // navegar para tela resultado
                val intent = Intent(this@MainActivity, ResultadoActivity::class.java).apply {
                    putExtra("JOGO", this@MainActivity.arrocha)
                }
//                intent.putExtra("JOGO", this@MainActivity.arrocha)
                startActivity(intent)
                this@MainActivity.arrocha = Arrocha()
            }

            this@MainActivity.etNumero.setText("")
        }
    }
}