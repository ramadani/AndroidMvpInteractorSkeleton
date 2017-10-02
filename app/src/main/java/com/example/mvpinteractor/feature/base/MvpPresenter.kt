package com.example.mvpinteractor.feature.base

interface MvpPresenter<V : MvpView, I : MvpInteractor> {

    fun onAttach(view: V)

    fun onDetach()

    fun getView(): V?

    fun getInteractor(): I
}
