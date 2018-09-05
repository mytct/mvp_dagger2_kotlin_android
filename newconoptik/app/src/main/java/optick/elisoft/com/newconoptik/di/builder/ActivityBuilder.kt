package optick.elisoft.com.newconoptik.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import optick.elisoft.com.newconoptik.ui.login.LoginActivityModule
import optick.elisoft.com.newconoptik.ui.login.view.LoginActivity

@Module
abstract class ActivityBuilder{
    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity
}