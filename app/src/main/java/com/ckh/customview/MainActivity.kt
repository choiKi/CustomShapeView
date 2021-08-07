package com.ckh.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ckh.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val customView = CustomView(this)
        binding.frameLayout.addView(customView)
    }
}