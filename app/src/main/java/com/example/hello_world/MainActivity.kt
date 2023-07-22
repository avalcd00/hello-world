package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movie = findViewById<MovieView>(R.id.movie)
        movie.setMovie(Movie("Dune", "http://"))

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