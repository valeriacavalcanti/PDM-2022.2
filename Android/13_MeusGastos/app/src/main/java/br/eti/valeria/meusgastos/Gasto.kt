package br.eti.valeria.meusgastos

class Gasto (var descricao: String, var valor: Float) {
    override fun toString(): String {
        return "${descricao} - ${valor}"
    }
}