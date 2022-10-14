package br.eti.valeria.popup

import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var btTexto: Button
    private lateinit var btData: Button
    private lateinit var btRadioGroup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btTexto = findViewById(R.id.btTexto)
        this.btData = findViewById(R.id.btData)
        this.btRadioGroup = findViewById(R.id.btRadioGroup)

        this.btTexto.setOnClickListener { texto() }
        this.btData.setOnClickListener { data() }
        this.btRadioGroup.setOnClickListener { radioGroup() }
    }

    fun texto(){
        var editText = EditText(this)
        val input = AlertDialog.Builder(this)
        input.setMessage("Digite um texto")
        input.setTitle("Texto")
        input.setView(editText)
        input.setPositiveButton("Salvar", DialogInterface.OnClickListener { dialogInterface, i ->
            this.btTexto.text = editText.text.toString()
        })
        input.setNegativeButton("Cancelar", null)
        input.create().show()
    }

    fun data(){
        var calendarView = CalendarView(this)
        val input = AlertDialog.Builder(this)
        input.setMessage("Escolha uma data")
        input.setTitle("CalendarView")
        input.setView(calendarView)
        calendarView.setOnDateChangeListener(OnDateChange())
        input.create().show()
    }

    fun radioGroup(){
        var radioGroup = RadioGroup(this)
        var radioSim = RadioButton(this).apply { text = "Sim" }
        var radioNao = RadioButton(this).apply { text = "Não" }
        radioGroup.addView(radioSim)
        radioGroup.addView(radioNao)

        val input = AlertDialog.Builder(this)
        input.setMessage("Escolha sim ou não")
        input.setTitle("RadioGroup")
        input.setView(radioGroup)
        input.setPositiveButton("Salvar", DialogInterface.OnClickListener { dialogInterface, i ->
            this.btRadioGroup.text = "${radioSim.isChecked} - ${radioNao.isChecked}"
        })
        input.setNegativeButton("Cancelar", null)
        input.create().show()
    }

    inner class OnDateChange: CalendarView.OnDateChangeListener{
        override fun onSelectedDayChange(p0: CalendarView, year: Int, month: Int, day: Int) {
            this@MainActivity.btData.text = "${day}/${month + 1}/${year}"
        }
    }
}