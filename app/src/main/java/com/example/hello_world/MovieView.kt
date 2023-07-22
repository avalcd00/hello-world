package com.example.hello_world

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MovieView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val cover: ImageView
    private val title: TextView

    init {
        var view = LayoutInflater.from(context).inflate(R.layout.view_movie, this, true)

        cover = view.findViewById(R.id.cover2)
        title = view.findViewById(R.id.title2)

        orientation = VERTICAL
    }

    fun setMovie(movie: Movie){
        title.text = movie.title
        //cover.image = movie.cover
    }
}