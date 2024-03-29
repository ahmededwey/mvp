package com.example.mvp.ui

import com.example.mvp.model.domain.User
import com.example.mvp.model.domain.Wisdom

interface MainViewInt {
    fun onSuccessGetUserInfo(user: User)
    fun onSuccessGetWisdom(wisdom: Wisdom)
}