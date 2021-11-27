package com.cheapy.cheapy.modules.main


import android.os.Bundle
import com.cheapy.cheapy.R
import com.cheapy.cheapy.databinding.ActivityMainBinding
import david.angulo.cheapy.modules.base.BaseActivity


class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(
    MainViewModel::class.java
) {
    override fun initViewModel(viewModel: MainViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
