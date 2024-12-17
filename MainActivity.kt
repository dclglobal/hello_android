package com.gamecodeschool.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a ConstraintLayout
        val layout = ConstraintLayout(this)
        layout.setBackgroundColor(Color.BLACK) // Set the background to black

        // Create a TextView
        val textView = TextView(this)
        textView.text = "Hello, Android!"
        textView.textSize = 48f
        textView.setTextColor(Color.parseColor("#39FF14")) // Neon green color
        textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER

        // Define LayoutParams
        val layoutParams = ConstraintLayout.LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )
        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
        layoutParams.bottomMargin = (resources.displayMetrics.heightPixels * 1 / 3)

        textView.layoutParams = layoutParams

        // Add TextView to the ConstraintLayout
        layout.addView(textView)

        // Set the layout as the activity's content view
        setContentView(layout)
    }
}