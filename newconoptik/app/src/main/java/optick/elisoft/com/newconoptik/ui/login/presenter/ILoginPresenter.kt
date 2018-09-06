package optick.elisoft.com.newconoptik.ui.login.presenter

import optick.elisoft.com.newconoptik.ui.core.presenter.ICorePresenter
import optick.elisoft.com.newconoptik.ui.login.contract.ILoginInteractor
import optick.elisoft.com.newconoptik.ui.login.view.ILoginView

interface ILoginPresenter<V : ILoginView, I : ILoginInteractor> : ICorePresenter<V , I>{
    fun onServerLoginClicked(email: String, password: String)
}