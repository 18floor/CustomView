package ru.netology.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import ru.netology.customview.view.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.stats)

        view.data  = listOf(
            500F, 500F, 500F, 500F,
        )

        findViewById<Button>(R.id.startButton).setOnClickListener {
            view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.view_animation))

        }
    }
}