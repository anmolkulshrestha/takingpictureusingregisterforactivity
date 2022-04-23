package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pp = registerForActivityResult(ActivityResultContracts.TakePicturePreview()) {
            findViewById<ImageView>(R.id.imageView).setImageBitmap(it)


        }
        pp.launch()
    }
}