package com.example.mvpinteractor.feature.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.mvpinteractor.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainMvpView {

    @Inject lateinit var presenter: MainMvpPresenter<MainMvpView, MainMvpInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }
}
