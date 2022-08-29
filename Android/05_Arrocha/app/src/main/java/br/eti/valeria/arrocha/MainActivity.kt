package br.eti.valeria.arrocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
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

        this.etNumero = findViewById(R.id.etNumero)
        this.btArrocha = findViewById(R.id.btArrocha)

        this.btArrocha.setOnClickListener(OnClickBotao())
    }

    inner class OnClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            var numero = this@MainActivity.etNumero.text.toString().toInt()
            var msg = this@MainActivity.arrocha.jogar(numero)

            if (this@MainActivity.arrocha.getStatus() == Status.GANHOU){
                msg = "Ganhou"
            }else if (this@MainActivity.arrocha.getStatus() == Status.PERDEU){
                msg = "Perdeu!"
            }

            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()

            this@MainActivity.etNumero.setText("")

            //var msg = "Seu número é ${numero}"
            //Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }
}