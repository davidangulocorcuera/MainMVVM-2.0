package com.cheapy.cheapy.modules.home


import android.view.View
import com.cheapy.cheapy.R
import com.cheapy.cheapy.databinding.FragmentHomeBinding
import david.angulo.cheapy.modules.base.BaseFragment


class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(
    HomeViewModel::class.java
) {

    override fun getLayoutRes(): Int {
        return R.layout.fragment_home
    }

    override fun viewCreated(view: View?) {
        mBinding.viewModel = viewModel
    }
}
