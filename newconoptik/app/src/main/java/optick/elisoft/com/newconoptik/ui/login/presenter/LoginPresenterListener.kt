package optick.elisoft.com.newconoptik.ui.login.presenter

import optick.elisoft.com.newconoptik.ui.core.presenter.CorePresenter
import optick.elisoft.com.newconoptik.ui.core.presenter.CorePresenterListener
import optick.elisoft.com.newconoptik.ui.login.contract.LoginContractListener
import optick.elisoft.com.newconoptik.ui.login.view.LoginView

interface LoginPresenterListener<V : LoginView, I : LoginContractListener> : CorePresenterListener<V , I>{
    fun onServerLoginClicked(email: String, password: String)
}