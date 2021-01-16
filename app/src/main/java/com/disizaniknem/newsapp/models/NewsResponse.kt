package com.disizaniknem.newsapp.models

import com.disizaniknem.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)