package com.example.customlodingerror

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customlodingerror.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        handleLoading(true)
        handleError(true)
    }

    private fun handleLoading(isLoading: Boolean) {
        binding.buttonPro.setOnClickListener {

            LoadingCustomView().showProgressBar(it)
        }
    }

    private fun handleError(isLoading: Boolean) {
        binding.buttonError.setOnClickListener {

            ErrorCustomView().showPopupWindow(it)
        }
    }
}