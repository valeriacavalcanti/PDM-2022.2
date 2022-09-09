package br.eti.valeria.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    private lateinit var btVai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btVai = findViewById(R.id.btMain)

        var result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == RESULT_OK){
                val msg = it.data?.getStringExtra("MSG_VOLTA")
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            }
        }

        this.btVai.setOnClickListener {
            val intent = Intent(this, SobreActivity::class.java).apply {
                putExtra("MSG_IDA", "Chegou!")
            }
            result.launch(intent)
        }



    }
}