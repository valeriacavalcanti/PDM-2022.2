package br.eti.valeria.geraldinho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etQtde: EditText
    private lateinit var btGerar: Button
    private lateinit var tvNumeros: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etQtde = findViewById(R.id.etQuantidade)
        this.btGerar = findViewById(R.id.btGerar)
        this.tvNumeros = findViewById(R.id.tvNumeros)

        this.etQtde.setText("6")
        this.tvNumeros.text = Gerador().gerar(6)

//        FORMA 1
//        this.btGerar.setOnClickListener {
//            var qtde = this.etQtde.text.toString().toInt()
//            this.tvNumeros.text = Gerador().gerar(qtde)
//        }

//        FORMA 2
//        this.btGerar.setOnClickListener { gerarNumeros() }

//        FORMA 3
        this.btGerar.setOnClickListener(ClickBotao())
    } // onCreate

    fun gerarNumeros(){
        var qtde = this.etQtde.text.toString().toInt()
        this.tvNumeros.text = Gerador().gerar(qtde)
    }

    inner class ClickBotao: View.OnClickListener{
        override fun onClick(p0: View?) {
            var qtde = this@MainActivity.etQtde.text.toString().toInt()
            this@MainActivity.tvNumeros.text = Gerador().gerar(qtde)
        }
    }

} // MainActivity