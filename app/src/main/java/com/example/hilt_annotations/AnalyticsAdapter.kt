package com.example.hilt_annotations

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class AnalyticsAdapter @Inject constructor(
    private val mainService: MainService
) { }