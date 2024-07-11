package com.example.alias

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.alias.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("score", 0)
        binding.scoreTextView.text = "Score: $score"

        binding.backToMainButton.setOnClickListener {
            val intent = Intent(this, AliasMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
