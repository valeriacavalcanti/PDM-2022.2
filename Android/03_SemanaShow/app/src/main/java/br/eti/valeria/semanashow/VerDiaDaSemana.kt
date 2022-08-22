package br.eti.valeria.semanashow

import java.util.*

class VerDiaDaSemana (var dia: Int, var mes: Int, var ano: Int) {
    fun getDiaDaSemana(): String{
        var c = Calendar.getInstance()
        var dias = arrayOf("", "DOM", "SEG", "TER", "QUA", "QUI", "SEX", "SAB")
        c.set(this.ano, this.mes - 1, this.dia)
        var d = c.get(Calendar.DAY_OF_WEEK)
        return dias[d]
    }
}