package david.angulo.onion.modules.main


import android.os.Bundle
import david.angulo.consilia.R
import david.angulo.consilia.databinding.ActivityMainBinding
import david.angulo.onion.modules.base.BaseActivity


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
