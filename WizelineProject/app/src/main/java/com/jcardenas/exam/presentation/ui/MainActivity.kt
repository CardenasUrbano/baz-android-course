package com.jcardenas.exam.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.jcardenas.exam.databinding.ActivityMainBinding
import com.jcardenas.exam.presentation.viewmodel.CryptoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val cryptoViewModel: CryptoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cryptoViewModel.onCreate()

        cryptoViewModel.availableBooks.observe(this, Observer {
            binding.txtHello.text = it[0].book
        })
        cryptoViewModel.isLoading.observe(this, Observer {
            binding.pbMain.isVisible = it
        })
    }


}