package com.cheapy.cheapy.modules.base

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment

/**
 * © Class created by David Angulo
 * */

class Navigator(private val activity: BaseActivity<*, *>) {

    private var fragmentManager = activity.supportFragmentManager

    fun navigate(
        fragmentToGo: BaseFragment<*, *>,
        addBackStack: Boolean = false,
        arguments: Bundle? = null,
        container: Int
    ) {

        val transaction = fragmentManager.beginTransaction()

        if (addBackStack) transaction.addToBackStack(fragmentToGo.LOG_TAG)

        transaction.replace(container, fragmentToGo, fragmentToGo.LOG_TAG)

        if (arguments != null) fragmentToGo.arguments = arguments

        transaction.commit()
    }

    fun addFragment(fragment: Fragment, container: Int, arguments: Bundle? = null) {
        val transaction = fragmentManager.beginTransaction()
        transaction.add(
            container,
            fragment
        )
        if (arguments != null) fragment.arguments = arguments
        transaction.commit()
    }

    fun removeFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()
        transaction.remove(
            fragment
        )
        transaction.commit()
    }

    fun navigateToActivity(intent: Intent, bundle: Bundle) {
        activity.finish()
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(activity.applicationContext, intent, bundle)
    }

    fun goToLastFragment() {
        fragmentManager.popBackStackImmediate()
    }

}