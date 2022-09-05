package com.example.hilt_annotations

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class AnalyticsAdapter @Inject constructor(
    @ApplicationContext val context: Context,
    private val mainService: MainService
) { }