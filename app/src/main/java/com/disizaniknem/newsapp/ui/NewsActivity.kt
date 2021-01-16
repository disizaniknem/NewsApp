package com.disizaniknem.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.disizaniknem.newsapp.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        // 0717d2ea46c84f969aed1f1de9c19b28

        // Bottom navigation bar
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}