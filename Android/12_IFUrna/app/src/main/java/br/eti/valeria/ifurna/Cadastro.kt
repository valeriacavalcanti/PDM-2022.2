package br.eti.valeria.ifurna

class Cadastro {
    private var lista: ArrayList<Candidato>

    init {
        this.lista = ArrayList()
    }

    fun add(c: Candidato){
        this.lista.add(c)
    }

    fun get(): ArrayList<Candidato>{
        return this.lista
    }

    fun get(index: Int): Candidato{
        return this.lista[index]
    }
}