package br.eti.valeria.geraldinho

import java.util.*
import kotlin.random.Random

class Gerador {
    fun gerar(qtde: Int): String{
        var lista = mutableSetOf<Int>()
        var random = Random(Calendar.getInstance().timeInMillis)

        while (lista.size < qtde){
            lista.add(random.nextInt(1,61))
        }
        return lista.toString()
    }
}