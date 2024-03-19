package com.example.mvp.model

import com.example.mvp.model.domain.User

class FakeDatabase {
    fun getUser(): User {
        return User("Omar Sa3id", 2003)
    }
}