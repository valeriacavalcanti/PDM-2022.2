package br.eti.valeria.ifurna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var fabAdd: FloatingActionButton
    private lateinit var cadastro: Cadastro
    private lateinit var lvCandidatos: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("CICLO", "OnCreate - Main")

        this.cadastro = Cadastro()

        this.fabAdd = findViewById(R.id.fabMainAdd)
        this.lvCandidatos = findViewById(R.id.lvMainCandidatos)

        this.lvCandidatos.setOnItemClickListener(ItemClickList())

        var adapter = ArrayAdapter<Candidato>(this, android.R.layout.simple_list_item_1, this.cadastro.get())
        this.lvCandidatos.adapter = adapter

        val resultForm = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == RESULT_OK){
                val candidato = it.data?.getSerializableExtra("CANDIDATO") as Candidato
                var msg = "${candidato.nome} - ${candidato.numero}"
//                Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

//                this.cadastro.add(candidato)
//                (this.lvCandidatos.adapter as ArrayAdapter<Candidato>).notifyDataSetChanged()

                (this.lvCandidatos.adapter as ArrayAdapter<Candidato>).add(candidato)

                Log.i("CICLO", this.cadastro.get().toString())
            }
        }

        this.fabAdd.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java).apply {
                putExtra("MSG_IDA", "Chegou!")
            }
//            startActivity(intent)
            resultForm.launch(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO", "OnStart - Main")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO", "OnResume - Main")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO", "OnPause - Main")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLO", "OnStop - Main")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CICLO", "OnRestart - Main")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO", "OnDestroy - Main")
    }

    inner class ItemClickList: AdapterView.OnItemClickListener{
        override fun onItemClick(p0: AdapterView<*>?, p1: View?, index: Int, p3: Long) {
            val c = this@MainActivity.cadastro.get(index)
            Toast.makeText(this@MainActivity, c.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}