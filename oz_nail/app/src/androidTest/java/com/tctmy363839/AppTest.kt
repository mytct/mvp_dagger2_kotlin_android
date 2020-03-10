package com.tctmy363839
import com.tctmy363839.di.DaggerTestAppComponent

class AppTest: App() {
    override fun initDagger() {
        DaggerTestAppComponent.builder().application(this).build().inject(this)
    }
}