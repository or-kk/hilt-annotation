package com.example.hilt_annotations

import javax.inject.Inject

class MainAdapter @Inject constructor(
    private val mainService: MainService
) { }