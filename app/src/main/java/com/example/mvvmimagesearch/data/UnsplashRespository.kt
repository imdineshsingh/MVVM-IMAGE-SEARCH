package com.example.mvvmimagesearch.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.mvvmimagesearch.api.UnsplashApi
import java.lang.reflect.Constructor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRespository @Inject constructor(private val unsplashApi: UnsplashApi) {

    fun getSearchResults(query:String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                UnsplashPagingSource(unsplashApi,query)
            }
        ).liveData

}