package com.cheapy.cheapy.modules.home

import android.os.Bundle
import com.cheapy.cheapy.R
import com.cheapy.cheapy.databinding.ActivityHomeBinding
import david.angulo.cheapy.modules.base.BaseActivity

class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding>(
    HomeViewModel::class.java
) {
    override fun getLayoutRes(): Int {
        return R.layout.activity_home
    }

    override fun initViewModel(viewModel: HomeViewModel) {
        binding.viewModel = viewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigator.addFragment(HomeFragment(), R.id.fragmentContainerHome)
    }
}
