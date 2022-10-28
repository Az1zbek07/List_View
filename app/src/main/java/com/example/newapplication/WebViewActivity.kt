package com.example.newapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.newapplication.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webViewClient = WebViewClient()
        val webView = binding.webView
        webView.webViewClient = webViewClient
        webView.settings.javaScriptEnabled = true
        webView.settings.supportZoom()

        binding.btnSearch.setOnClickListener {
            if (binding.editSite.text.isNotBlank()){
                val text = binding.editSite.text.toString().trim()
                webView.loadUrl("https://$text")
            } else{
                Toast.makeText(this, "Enter name of site", Toast.LENGTH_SHORT).show()
            }
        }
    }
}