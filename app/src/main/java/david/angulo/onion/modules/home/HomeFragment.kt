package david.angulo.onion.modules.home


import android.view.View
import david.angulo.consilia.R
import david.angulo.consilia.databinding.FragmentHomeBinding
import david.angulo.onion.modules.base.BaseFragment


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
