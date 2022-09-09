package br.eti.valeria.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SobreActivity : AppCompatActivity() {
    private lateinit var btVolta: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        this.btVolta = findViewById(R.id.btSobre)

        if (intent.hasExtra("MSG_IDA")){
            val msg = intent.getStringExtra("MSG_IDA")
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }

        this.btVolta.setOnClickListener {
            val intent = Intent().apply {
                putExtra("MSG_VOLTA", "Deu certo mesmo!")
            }
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}