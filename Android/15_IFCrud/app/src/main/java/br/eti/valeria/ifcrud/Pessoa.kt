package br.eti.valeria.ifcrud

import java.util.*

class Pessoa {
    var id: Int
    var nome: String
    var data: Calendar

    // memória
    constructor(nome: String){
        this.id = -1
        this.nome = nome
        this.data = Calendar.getInstance()
    }

    // banco
    constructor(id: Int, nome: String, data: Long){
        this.id = id
        this.nome = nome
        this.data = Calendar.getInstance()
        this.data.timeInMillis = data
    }

    private fun dataHora(): String{
        val dia = this.data.get(Calendar.DAY_OF_MONTH)
        val mes = this.data.get(Calendar.MONTH) + 1
        val ano = this.data.get(Calendar.YEAR)
        val hora = this.data.get(Calendar.HOUR_OF_DAY)
        val minuto = this.data.get(Calendar.MINUTE)
        val segundo = this.data.get(Calendar.SECOND)
        return "${dia}/${mes}/${ano} ${hora}:${minuto}:${segundo}"
    }

    override fun toString(): String {
        return "${id} - ${nome} - ${dataHora()}"
    }
}