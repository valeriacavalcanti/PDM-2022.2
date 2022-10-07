package br.eti.valeria.ifcrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var listView: ListView
    private lateinit var dao: PessoaDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.dao = PessoaDAO(this)

        this.button = findViewById(R.id.button)
        this.editText = findViewById(R.id.editText)
        this.listView = findViewById(R.id.listView)

        this.atualiza()

        this.listView.setOnItemClickListener(OnItemClick())
        this.listView.setOnItemLongClickListener(OnItemLongClick())

        this.button.setOnClickListener { salvar() }
    }

    fun salvar(){
        val nome = this.editText.text.toString()
        val pessoa = Pessoa(nome)
        this.dao.insert(pessoa)
        this.atualiza()
        this.editText.setText("")
    }

    fun atualiza(){
        val layout = android.R.layout.simple_list_item_1
        this.listView.adapter = ArrayAdapter<Pessoa>(this, layout,this.dao.read())
    }

    inner class OnItemClick: AdapterView.OnItemClickListener{
        override fun onItemClick(adapter: AdapterView<*>?, view: View?, index: Int, id: Long) {
            val pessoa = adapter?.getItemAtPosition(index) as Pessoa
            Toast.makeText(this@MainActivity, pessoa?.nome, Toast.LENGTH_SHORT).show()
        }
    }

    inner class OnItemLongClick: AdapterView.OnItemLongClickListener{
        override fun onItemLongClick(adapter: AdapterView<*>?, view: View?, index: Int, id: Long): Boolean {
            val pessoa = adapter?.getItemAtPosition(index) as Pessoa
            this@MainActivity.dao.delete(pessoa)
            val msg = "${pessoa.nome} removido com sucesso!"
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
            this@MainActivity.atualiza()
            return true
        }
    }
}