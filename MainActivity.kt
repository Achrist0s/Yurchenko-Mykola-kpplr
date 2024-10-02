package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Масив з ідентифікаторами зображень
    private val images = arrayOf(
        R.drawable.image1, // Замість image1 використайте ваші назви файлів
        R.drawable.image2,
        R.drawable.image3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val btnShowImage: Button = findViewById(R.id.btnShowImage)

        btnShowImage.setOnClickListener {
            // Вибір випадкового зображення
            val randomIndex = Random.nextInt(images.size)
            val randomImage = images[randomIndex]

            // Встановлюємо випадкове зображення в ImageView
            imageView.setImageResource(randomImage)
        }
    }
}