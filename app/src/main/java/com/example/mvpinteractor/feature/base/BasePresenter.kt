package com.example.mvpinteractor.feature.base

import javax.inject.Inject

open class BasePresenter<V : MvpView, I : MvpInteractor>
@Inject constructor(private val interactor: I) : MvpPresenter<V, I> {

    private var view: V? = null

    override fun onAttach(view: V) {
        this.view = view
    }

    override fun onDetach() {
        if (view != null) view = null
    }

    override fun getView(): V? = view

    override fun getInteractor(): I = interactor
}
