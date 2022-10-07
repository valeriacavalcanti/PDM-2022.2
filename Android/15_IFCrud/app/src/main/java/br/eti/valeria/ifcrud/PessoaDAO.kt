package br.eti.valeria.ifcrud

import android.content.ContentValues
import android.content.Context

class PessoaDAO {
    val banco: BancoHelper

    constructor(context: Context){
        this.banco = BancoHelper(context)
    }

    fun insert(pessoa: Pessoa){
        val cv = ContentValues()
        cv.put("nome", pessoa.nome)
        cv.put("data", pessoa.data.timeInMillis)
        this.banco.writableDatabase.insert("pessoas", null, cv)
    }

    fun read(): ArrayList<Pessoa>{
        val lista = arrayListOf<Pessoa>()
        val colunas = arrayOf("id", "nome", "data")
        val c = this.banco.readableDatabase.query("pessoas", colunas, null, null, null, null, "nome")
        c.moveToFirst()
        for (i in 1 .. c.count){
            val id = c.getInt(0)
            val nome = c.getString(1)
            val data = c.getLong(2)
            val pessoa = Pessoa(id, nome, data)
            lista.add(pessoa)
            c.moveToNext()
        }
        return lista
    }

    fun find(id: Int): Pessoa?{
        return null
    }

    fun delete(id: Int){
        val where = arrayOf(id.toString())
        this.banco.writableDatabase.delete("pessoas", "id = ?", where)
    }

    fun delete(pessoa: Pessoa){
        this.delete(pessoa.id)
    }

    fun update(pessoa: Pessoa){

    }
}