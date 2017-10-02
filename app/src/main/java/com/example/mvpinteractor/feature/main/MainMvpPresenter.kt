package com.example.mvpinteractor.feature.main

import com.example.mvpinteractor.feature.base.MvpPresenter

interface MainMvpPresenter<V : MainMvpView, I : MainMvpInteractor> : MvpPresenter<V, I>
