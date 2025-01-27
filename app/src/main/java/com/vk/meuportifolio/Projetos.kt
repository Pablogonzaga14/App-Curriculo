package com.vk.meuportifolio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vk.meuportifolio.databinding.ActivityProjetosBinding

class Projetos : AppCompatActivity() {

    private lateinit var binding: ActivityProjetosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbarContato = binding.toolbarProjetos
        toolbarContato.setNavigationOnClickListener(){
            finish()
        }

    }
}