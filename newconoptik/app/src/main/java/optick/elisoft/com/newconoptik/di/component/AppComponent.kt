package optick.elisoft.com.newconoptik.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import optick.elisoft.com.newconoptik.NewConOptikApp
import optick.elisoft.com.newconoptik.di.builder.ActivityBuilder
import optick.elisoft.com.newconoptik.di.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    (AndroidInjectionModule::class),
    (AppModule::class),
    (ActivityBuilder::class)
])
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(app: NewConOptikApp)
}