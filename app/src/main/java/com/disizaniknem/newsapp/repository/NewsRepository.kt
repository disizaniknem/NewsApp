package com.disizaniknem.newsapp.repository

import com.disizaniknem.newsapp.api.RetrofitInstance
import com.disizaniknem.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

}