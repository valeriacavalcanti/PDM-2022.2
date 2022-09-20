package br.eti.valeria.meusgastos

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class GastoAdapter(var context: Context, var lista: MutableList<Gasto>): BaseAdapter() {

    override fun getCount(): Int = this.lista.size

    override fun getItem(index: Int): Any {
        return this.lista.get(index)
    }

    override fun getItemId(id: Int): Long {
        return id.toLong()
    }

    override fun getView(index: Int, view: View?, viewGroup: ViewGroup?): View {
        val viewLocal = if (view == null){
            LayoutInflater.from(this.context).inflate(R.layout.list_item, viewGroup, false)
        }else{
            view
        }

        val gasto = this.lista.get(index)
        val tvDescricao:TextView = viewLocal.findViewById(R.id.tvItemDescricao)
        val tvValor:TextView = viewLocal.findViewById(R.id.tvItemValor)

        tvDescricao.text = gasto.descricao
        tvValor.text = gasto.valor.toString()

        if (index % 2 == 0){
            viewLocal.setBackgroundColor(Color.LTGRAY)
        }else{
            viewLocal.setBackgroundColor(Color.WHITE)
        }

        return viewLocal
    }
}