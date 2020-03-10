
package com.tctmy363839.di

import com.tctmy363839.data.DataRepository
import com.tctmy363839.data.DataSource
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

// Tells Dagger this is a Dagger module
@Module
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepository: DataRepository): DataSource
}
