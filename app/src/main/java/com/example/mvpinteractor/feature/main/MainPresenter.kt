package com.example.mvpinteractor.feature.main

import com.example.mvpinteractor.feature.base.BasePresenter
import javax.inject.Inject

class MainPresenter<V : MainMvpView, I : MainMvpInteractor>
@Inject constructor(interactor: I) : BasePresenter<V, I>(interactor), MainMvpPresenter<V, I>
