package com.example.collectionofgames

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.collectionofgames.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alias.setOnClickListener {
            val intent = Intent(this, com.example.alias.AliasMainActivity::class.java)
            startActivity(intent)
        }

        binding.ticTacToe.setOnClickListener {
            val intent = Intent(this, com.example.tictactoe.TicTacToeMainActivity::class.java)
            startActivity(intent)
        }

        binding.guessPassword.setOnClickListener {
            val intent = Intent(this, com.example.guesspassword.GuessPasswordMainActivity::class.java)
            startActivity(intent)
        }
    }
}