package com.cheapy.cheapy.modules.main

import android.app.Application
import com.cheapy.cheapy.application.App
import david.angulo.cheapy.modules.base.BaseViewModel

class MainViewModel(app: Application) : BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }
}