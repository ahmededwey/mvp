package com.example.mvp.presenter

import com.example.mvp.model.repository.MainRepo
import com.example.mvp.ui.MainViewInt

class MainPresenter {
    //    private val fakeApiService=FakeApiService()
//    private val fakeDatabase=FakeDatabase()
    private val mainRepo = MainRepo()
    lateinit var mainViewInt: MainViewInt

    fun getUserInfo() {
        val result = mainRepo.getUserInfo()
        mainViewInt.onSuccessGetUserInfo(result)
    }

    fun getWisdom() {
        val result = mainRepo.getWisdom()
        mainViewInt.onSuccessGetWisdom(result)
    }
}