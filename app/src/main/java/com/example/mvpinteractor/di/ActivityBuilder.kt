package com.example.mvpinteractor.di

import com.example.mvpinteractor.feature.main.MainActivity
import com.example.mvpinteractor.feature.main.MainScreenModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainScreenModule::class))
    abstract fun bindMainActivity(): MainActivity
}
