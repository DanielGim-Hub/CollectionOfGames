package com.example.alias

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alias.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    private val words = listOf("Яблоко", "Банан", "Вишня", "Груша", "Черника", "Апельсин")
    private var currentWordIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showNextWord()

        binding.correctButton.setOnClickListener {
            score++
            showNextWord()
        }

        binding.skipButton.setOnClickListener {
            showNextWord()
        }
    }

    private fun showNextWord() {
        if (currentWordIndex < words.size) {
            binding.wordTextView.text = words[currentWordIndex]
            currentWordIndex++
        } else {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }
}
