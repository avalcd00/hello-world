package com.example.hello_world

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.coroutines.coroutineContext

class MoviesAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.view_movie, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val cover = view.findViewById<ImageView>(R.id.cover2)
        private val title = view.findViewById<TextView>(R.id.title2)

        fun bind(movie: Movie){
            title.text = movie.title
            Glide.with(cover.context).load(movie.cover).into(cover)
        }
    }

}