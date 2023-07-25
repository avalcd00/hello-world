package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val movie = findViewById<MovieView>(R.id.movie)
        //.setMovie(Movie("Dune", "https://e0.pxfuel.com/wallpapers/698/615/desktop-wallpaper-phone-dune-thumbnail.jpg"))

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = MoviesAdapter(listOf(
            Movie("Movie 1", "https://loremflickr.com/320/240?lock=1"),
            Movie("Movie 2", "https://loremflickr.com/320/240?lock=2"),
            Movie("Movie 3", "https://loremflickr.com/320/240?lock=3"),
            Movie("Movie 4", "https://loremflickr.com/320/240?lock=4"),
            Movie("Movie 5", "https://loremflickr.com/320/240?lock=5"),
            Movie("Movie 6", "https://loremflickr.com/320/240?lock=6"),
            Movie("Movie 7", "https://loremflickr.com/320/240?lock=7"),
            Movie("Movie 8", "https://loremflickr.com/320/240?lock=8"),
            Movie("Movie 9", "https://loremflickr.com/320/240?lock=9")
        ))

        /*val helloText = findViewById<TextView>(R.id.hello_text)
        helloText.text = "Hello Android"*/

        /*val email = findViewById<TextView>(R.id.email)
        val phone = findViewById<TextView>(R.id.phone)
        val sendButton = findViewById<Button>(R.id.send)

        sendButton.setOnClickListener(){
            val message = "Email: ${email.text}, Teléfono: ${phone.text}"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            Log.d(tag, "Button Clicked")
        }*/

        //Log.d(tag, "onCreate")
    }
/*
    override fun onStart() {
        Log.d(tag, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "onDestroy")
        super.onDestroy()
    }


*/





}