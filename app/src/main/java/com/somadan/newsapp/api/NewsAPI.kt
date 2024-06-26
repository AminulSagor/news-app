package com.somadan.newsapp.api

import com.somadan.newsapp.models.NewsResponse
import com.somadan.newsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getHeadline(
        @Query("country")
        countryCode:String ="US",
        @Query("page")
        pageNumber : Int = 1,
        @Query("apiKey")
        apiKey :String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery:String ,
        //Checking
        @Query("page")
        pageNumber : Int = 1,
        @Query("apiKey")
        apiKey :String = API_KEY
    ): Response<NewsResponse>
}