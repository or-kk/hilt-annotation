package com.example.hilt_annotations

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class AnalyticsModule {

    @Provides
    fun providesAnalyticsService(
        converterFactory: GsonConverterFactory
    ): AnalyticsService {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .addConverterFactory(converterFactory)
            .build()
            .create(AnalyticsService::class.java)
    }
}