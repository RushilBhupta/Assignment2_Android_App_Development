package main.first.assignment2

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity

import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var resultImageView: ImageView
    private lateinit var rollButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultImageView = findViewById(R.id.resultImageView)
        rollButton = findViewById(R.id.rollButton)

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val random = Random()
        when (random.nextInt(6) + 1) {
            1 -> {
                resultImageView.setImageResource(R.drawable.dice1)
            }
            2 -> {
                resultImageView.setImageResource(R.drawable.dice2)
            }
            3 -> {
                resultImageView.setImageResource(R.drawable.dice3)
            }
            4 -> {
                resultImageView.setImageResource(R.drawable.dice4)
            }
            5 -> {
                resultImageView.setImageResource(R.drawable.dice5)
            }
            else -> {
                resultImageView.setImageResource(R.drawable.dice6)
            }
        }

    }
}

