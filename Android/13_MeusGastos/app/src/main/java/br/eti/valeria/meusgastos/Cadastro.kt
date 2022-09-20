package br.eti.valeria.meusgastos

var CONTROLE = 1
class Cadastro {
    private var lista: MutableList<Gasto>

    init {
        this.lista = mutableListOf()
    }

    fun get(): MutableList<Gasto>{
        return this.lista
    }

    fun get(index: Int): Gasto{
        return this.lista.get(index)
    }

    fun addLote(){
        for (i in CONTROLE .. CONTROLE + 5){
            this.lista.add(Gasto("Gasto ${i}", i.toFloat()))
        }
        CONTROLE += 6
    }

    fun remove(index: Int){
        this.lista.removeAt(index)
    }
}