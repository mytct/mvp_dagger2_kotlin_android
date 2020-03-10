package com.tctmy363839.di

import com.tctmy363839.TestDataReprository
import com.tctmy363839.data.DataSource
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class TestDataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepository: TestDataReprository): DataSource
}