package com.example.mvpinteractor.feature.main

import dagger.Module
import dagger.Provides

@Module
class MainScreenModule {

    @Provides
    fun provideInteractor(interactor: MainInteractor): MainMvpInteractor = interactor

    @Provides
    fun providePresenter(presenter: MainPresenter<MainMvpView, MainMvpInteractor>):
            MainMvpPresenter<MainMvpView, MainMvpInteractor> = presenter
}
