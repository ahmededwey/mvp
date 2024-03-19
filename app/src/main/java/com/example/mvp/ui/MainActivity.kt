package com.example.mvp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.model.domain.User
import com.example.mvp.model.domain.Wisdom
import com.example.mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainViewInt {
    lateinit var binding: ActivityMainBinding
    val presenter = MainPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
    }

    private fun setUp() {
        presenter.mainViewInt = this
        presenter.getUserInfo()
        binding.btnFetch.setOnClickListener {
            presenter.getWisdom()
        }
    }

    override fun onSuccessGetUserInfo(user: User) {
        binding.username.text = user.name
    }

    override fun onSuccessGetWisdom(wisdom: Wisdom) {
        binding.apply {
            content.text=wisdom.content
            date.text=wisdom.date
        }

    }
}