package com.example.mvp.model.repository

import com.example.mvp.model.FakeApiService
import com.example.mvp.model.FakeDatabase

class MainRepo {
    private val fakeApiService = FakeApiService()
    private val fakeDatabase = FakeDatabase()
    fun getUserInfo() = fakeDatabase.getUser()
    fun getWisdom() = fakeApiService.getRandomWisdom()
}