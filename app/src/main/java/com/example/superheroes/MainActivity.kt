package com.example.superheroes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val superheroes = listOf(
            Superhero("Ник Ночь и День", "Герой с реактивным ранцем", R.drawable.android_superhero1),
            Superhero("Защитник Реальности", "Понимает абсолютную истину", R.drawable.android_superhero2),
            Superhero("Андре Великан", "Сливается с окружающей средой", R.drawable.android_superhero3),
            Superhero("Бенжамин Храбрый", "Использует силу канарейки", R.drawable.android_superhero4),
            Superhero("Великолепный Мару", "Легко спасает день", R.drawable.android_superhero5)
        )

        // Установка адаптера
        val adapter = SuperheroAdapter(superheroes)
        recyclerView.adapter = adapter
    }
}
