package optick.elisoft.com.newconoptik.di.module

import android.app.Application
import android.content.Context
import optick.elisoft.com.newconoptik.data.preferences.AppPreferenceHelper
import optick.elisoft.com.newconoptik.data.preferences.PreferenceHelper
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import optick.elisoft.com.newconoptik.BuildConfig
import optick.elisoft.com.newconoptik.data.network.ApiHeader
import optick.elisoft.com.newconoptik.data.network.ApiHelper
import optick.elisoft.com.newconoptik.data.network.AppApiHelper
import optick.elisoft.com.newconoptik.di.ApiKeyInfo
import optick.elisoft.com.newconoptik.di.PreferencesInfo
import optick.elisoft.com.newconoptik.util.AppConstants
import optick.elisoft.com.newconoptik.util.SchedulerProvider
import javax.inject.Singleton

@Module
class AppModule{
    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferencesInfo
    internal fun providePrefFilename(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()

    @Provides
    @Singleton
    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(apiKey = apiKey,
            userId = preferenceHelper.getCurrentUserId(),
            accessToken = preferenceHelper.getAccessToken())
}