package com.example.mvvmimagesearch.api

import com.example.mvvmimagesearch.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    companion object{
        const val BASE_URL=BuildConfig.BASE_URL
        const val CLIENT_ID=BuildConfig.UNSPLASH_ACCESS_KEY
    }

    @Headers("Accept-Version: v1","Authorization: Client-ID $CLIENT_ID")
    @GET("search/photos")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page:Int,
        @Query("per_page") perPage: Int
    ) : UnsplashResponse
}