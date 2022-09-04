package com.example.hilt_annotations


import okhttp3.Response
import retrofit2.http.GET

interface AnalyticsService {

    @GET("test/fetch/")
    fun getAnalytics()
}