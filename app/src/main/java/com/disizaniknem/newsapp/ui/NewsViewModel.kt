package com.disizaniknem.newsapp.ui

import androidx.lifecycle.ViewModel
import com.disizaniknem.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}