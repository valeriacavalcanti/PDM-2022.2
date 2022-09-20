package br.eti.valeria.meusgastos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var cadastro: Cadastro
    private lateinit var lvGastos: ListView
    private lateinit var fabAdd: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.cadastro = Cadastro()

        this.lvGastos = findViewById(R.id.lvGastos)
        this.fabAdd = findViewById(R.id.fabAdd)

//        val adapter = ArrayAdapter<Gasto>(this, android.R.layout.simple_list_item_1, this.cadastro.get())
        val adapter = GastoAdapter(this, this.cadastro.get())
        this.lvGastos.adapter = adapter

        this.lvGastos.setOnItemClickListener(ClickList())
        this.lvGastos.setOnItemLongClickListener(LongClickList())

        this.fabAdd.setOnClickListener{
            this.cadastro.addLote()
            this.atualiza()
            Log.i("APP_GASTOS", this.cadastro.get().toString())
        }
    }

    private fun atualiza(){
//        (this.lvGastos.adapter as ArrayAdapter<Gasto>).notifyDataSetChanged()
        (this.lvGastos.adapter as GastoAdapter).notifyDataSetChanged()
    }

    inner class ClickList: AdapterView.OnItemClickListener{
        override fun onItemClick(p0: AdapterView<*>?, view: View?, index: Int, id: Long) {
            val gasto = this@MainActivity.cadastro.get(index)
            Toast.makeText(this@MainActivity, gasto.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    inner class LongClickList: AdapterView.OnItemLongClickListener{
        override fun onItemLongClick(adapter: AdapterView<*>?, view: View?, index: Int, id: Long): Boolean {
            this@MainActivity.cadastro.remove(index)
            this@MainActivity.atualiza()
            return true
        }
    }
}