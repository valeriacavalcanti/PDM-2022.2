package br.eti.valeria.ifurna

import java.io.Serializable

class Candidato (var nome: String, var numero: Int): Serializable{
    override fun toString(): String {
        return "${nome} - ${numero}"
    }
}