package optick.elisoft.com.newconoptik.util.extension

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import optick.elisoft.com.newconoptik.R

internal fun FragmentManager.removeFragment(tag: String, slideIn: Int= R.anim.slide_left, slideOut: Int= R.anim.slide_right){
    this.beginTransaction()
            .disallowAddToBackStack()
            .setCustomAnimations(slideIn, slideOut)
            .remove(this.findFragmentByTag(tag))
            .commitNow()
}

internal fun FragmentManager.addFragment(containerId: Int, fragment: Fragment, tag: String, slideIn: Int= R.anim.slide_left, slideOut: Int=R.anim.slide_right){
    this.beginTransaction()
            .disallowAddToBackStack()
            .setCustomAnimations(slideIn, slideOut)
            .add(containerId, fragment, tag)
            .commit()
}