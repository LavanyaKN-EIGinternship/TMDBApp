package com.happiestminds.tmdbapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class ActionActivity : AppCompatActivity() {
    lateinit var overVTextView: TextView
    lateinit var imageView: ImageView
    lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)
        overVTextView = findViewById(R.id.overVT)
        imageView = findViewById(R.id.imageV)
        titleTextView = findViewById(R.id.textT)

        val selctedData = intent.getParcelableExtra<Movie>("movie")
        overVTextView.text = "${selctedData?.overview}"
        titleTextView.text = "${selctedData?.title}"

        val url = "https://image.tmdb.org/t/p/w500${selctedData?.poster_path}"
        Glide.with(this).load(url).into(imageView)
    }
}