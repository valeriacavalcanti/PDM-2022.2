package br.eti.valeria.ifbrowser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var etEndereco: EditText
    private lateinit var btVai: Button
    private lateinit var wvSite: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etEndereco = findViewById(R.id.etEndereco)
        this.btVai = findViewById(R.id.btVai)
        this.wvSite = findViewById(R.id.wvSite)

        this.wvSite.webViewClient = WebViewClient()
        this.wvSite.settings.javaScriptEnabled = true
        this.wvSite.settings.setSupportZoom(true)

        if (intent.data != null){
            this.wvSite.loadUrl(intent.data.toString())
        }

        this.btVai.setOnClickListener { onClick() }
    }

    private fun onClick(){
        val endereco = this.etEndereco.text.toString()
        this.wvSite.loadUrl(endereco)
    }

    private fun html(){
        val intent = Intent("IFBROWSER")
        startActivity(intent)
    }
}