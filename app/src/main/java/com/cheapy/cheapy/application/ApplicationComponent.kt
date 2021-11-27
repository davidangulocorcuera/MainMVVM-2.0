package com.cheapy.cheapy.application

import android.content.Context
import android.content.SharedPreferences
import dagger.Component
import com.cheapy.cheapy.modules.base.BaseViewModel
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun app(): App

    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(baseViewModel: BaseViewModel)



}
