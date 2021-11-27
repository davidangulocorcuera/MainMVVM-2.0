package com.cheapy.cheapy.modules.home

import android.app.Application
import com.cheapy.cheapy.application.App
import david.angulo.cheapy.modules.base.BaseViewModel

class HomeViewModel(app: Application) : BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }
}