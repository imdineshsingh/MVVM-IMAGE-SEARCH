package com.example.mvvmimagesearch.api

import com.example.mvvmimagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results:List<UnsplashPhoto>
) {

}