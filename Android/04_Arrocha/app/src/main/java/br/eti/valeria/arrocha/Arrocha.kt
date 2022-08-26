package br.eti.valeria.arrocha

class Arrocha {
    private var maior: Int
    private var menor: Int
    private var secreto: Int

    init {
        this.menor = 2
        this.maior = 99
        // gerar número aleatório
        this.secreto = -1
    }

    fun jogar(chute: Int): <??>{
        // implementar o jogo aqui
    }

    fun isArrochado(): Boolean{
        return menor + 1 == maior - 1
    }
}