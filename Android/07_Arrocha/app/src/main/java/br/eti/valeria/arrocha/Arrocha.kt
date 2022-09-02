package br.eti.valeria.arrocha

import android.util.Log
import java.util.*
import kotlin.random.Random

class Arrocha {
    private var maior: Int
    private var menor: Int
    private var secreto: Int
    private var status: Status

    init {
        var random = Random(Calendar.getInstance().timeInMillis)
        this.menor = 1
        this.maior = 100
        // gerar número aleatório
        this.secreto = random.nextInt(this.menor + 1, this.maior)
        // Exibir no log o valor sorteado e o intervalo inicial
        Log.i("APP_ARROCHA", this.secreto.toString())
        Log.w("APP_ARROCHA", "(${this.menor},${this.maior})")
        this.status = Status.EXECUTANDO
    }

    fun jogar(chute: Int): String?{
        var msg = ""

        if (this.status == Status.EXECUTANDO){
            if ((chute == this.secreto) || (!this.isValido(chute))){
                this.status = Status.PERDEU
            }else{
                // atualizar o intervalo
                if (chute < this.secreto) {
                    this.menor = chute
                    msg = "O número é menor do que o secreto!"
                } else {
                    this.maior = chute
                    msg = "O número é maior do que o secreto!"
                }

                // Exibir no log o valor sorteado e o intervalo atualizado
                Log.w("APP_ARROCHA", "(${this.menor},${this.maior})")

                if (this.isArrochado()){
                    this.status = Status.GANHOU
                }else{
                    return msg
                }
            }
        }
        return null
    }

    private fun isValido(chute: Int): Boolean{
        return chute > this.menor && chute < this.maior
    }

    private fun isArrochado(): Boolean{
        return menor + 1 == maior - 1
    }

    fun getStatus(): Status{
        return this.status
    }
}