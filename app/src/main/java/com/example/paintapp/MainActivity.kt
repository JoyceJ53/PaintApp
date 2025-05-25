package com.example.paintapp

import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.paintapp.ui.theme.PaintAppTheme

class MainActivity : ComponentActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val yellowBtn = findViewById<ImageButton>(R.id.yellowColor)
        val greenBtn = findViewById<ImageButton>(R.id.greenColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val whiteBtn = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Red selected", Toast.LENGTH_SHORT).show()
//            paintBrush.setColor(Color.RED)
        }
        yellowBtn.setOnClickListener {
            Toast.makeText(this,"Yellow selected", Toast.LENGTH_SHORT).show()

        }
        greenBtn.setOnClickListener {
            Toast.makeText(this,"Green selected", Toast.LENGTH_SHORT).show()

        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Blue selected", Toast.LENGTH_SHORT).show()

        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"Black selected", Toast.LENGTH_SHORT).show()

        }
        whiteBtn.setOnClickListener {
            Toast.makeText(this,"White selected", Toast.LENGTH_SHORT).show()

        }
    }

//    private fun currectColor(color: Int){
//        currentBrush = color
//    }
}
