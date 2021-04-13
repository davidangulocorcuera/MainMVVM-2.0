package david.angulo.onion.modules.home

import android.app.Application
import david.angulo.onion.application.App
import david.angulo.onion.modules.base.BaseViewModel

class HomeViewModel(app: Application) : BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }
}