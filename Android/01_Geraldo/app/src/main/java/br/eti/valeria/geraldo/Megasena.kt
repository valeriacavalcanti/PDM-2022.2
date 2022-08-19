package br.eti.valeria.geraldo

import java.util.*
import kotlin.random.Random

class Megasena {
    var numeros: MutableSet<Int>

    init {
        this.numeros = mutableSetOf()
        this.geraNumeros()
    }

    private fun geraNumeros(){
        var random = Random(Calendar.getInstance().timeInMillis)
        while (this.numeros.size < 6){
            this.numeros.add(random.nextInt(1,61))
        }
    }
}