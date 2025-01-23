package com.vk.meuportifolio

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vk.meuportifolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fotoPerfil = BitmapFactory.decodeResource(resources, R.drawable.foto_perfil2)
        val circulo = RoundedBitmapDrawableFactory.create(resources, fotoPerfil);
        circulo.isCircular = true
        binding.imgFotoPerfil.setImageDrawable(circulo)

        binding.btProjetos.setOnClickListener {
            val intent = Intent (this, Projetos::class.java)
            startActivity(intent)
        }
        binding.btContato.setOnClickListener {
            val intent = Intent (this, Contato::class.java)
            startActivity(intent)
        }
        }

}