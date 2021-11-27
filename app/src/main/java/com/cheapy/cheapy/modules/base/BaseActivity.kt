package david.angulo.cheapy.modules.base

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ProgressBar
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders
import com.cheapy.cheapy.R
import com.cheapy.cheapy.modules.utils.setVisible

/**
 * © Class created by David Angulo
 * */

abstract class BaseActivity<VM : BaseViewModel, DB : ViewDataBinding>(private val mViewModelClass: Class<VM>) :
    AppCompatActivity() {

    @LayoutRes
    abstract fun getLayoutRes(): Int

    val navigator: Navigator by lazy { Navigator(this) }

    val binding by lazy {
        DataBindingUtil.setContentView(this, getLayoutRes()) as DB
    }

    val viewModel by lazy {
        ViewModelProviders.of(this).get(mViewModelClass)
    }

    /**
     * If you want to inject Dependency Injection
     * on your activity, you can override this.
     */
    open fun onInject() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        initViewModel(viewModel)

        super.onCreate(savedInstanceState)

        onInject()
    }

    /**
     *
     *  You need override this method.
     *  And you need to set viewModel to binding: binding.viewModel = viewModel
     *
     */
    abstract fun initViewModel(viewModel: VM)

    private fun enableScreen(enable: Boolean) {
        if (!enable) window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
        else window.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )
    }

    fun showProgress(show: Boolean, hasShade: Boolean) {
        enableScreen(show || hasShade)
        val progress = findViewById<ProgressBar>(R.id.progress)
        val progressContainer = findViewById<View>(R.id.progressContainer)
        progressContainer?.setVisible(hasShade)
        progress?.setVisible(show)
    }
}
