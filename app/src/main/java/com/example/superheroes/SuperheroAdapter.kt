package com.example.superheroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(private val superheroes: List<Superhero>) : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>() {

    // ViewHolder для Superhero
    class SuperheroViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.superhero_name)
        val description = view.findViewById<TextView>(R.id.superhero_description)
        val image = view.findViewById<ImageView>(R.id.superhero_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        return SuperheroViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val superhero = superheroes[position]
        holder.name.text = superhero.name
        holder.description.text = superhero.description
        holder.image.setImageResource(superhero.imageResId)  // Устанавливаем изображение
    }

    override fun getItemCount(): Int {
        return superheroes.size
    }
}
