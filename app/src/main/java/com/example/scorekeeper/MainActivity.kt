package com.example.scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scoreOne:TextView = findViewById(R.id.textView)
        val scoreTwo:TextView = findViewById(R.id.textView2)

        val teamOneButton:Button = findViewById(R.id.pob)
        val teamTwoButton:Button = findViewById(R.id.ptb)
        val resetButton:Button = findViewById(R.id.reset)

        teamOneButton.setOnClickListener {
            scoreOne.text = ScoreHolder().updateScore(scoreOne.text as String)
        }

        teamTwoButton.setOnClickListener {
            scoreTwo.text = ScoreHolder().updateScore(scoreTwo.text as String)
        }

        resetButton.setOnClickListener {
            scoreOne.text = "0"
            scoreTwo.text = "0"
        }
    }
}