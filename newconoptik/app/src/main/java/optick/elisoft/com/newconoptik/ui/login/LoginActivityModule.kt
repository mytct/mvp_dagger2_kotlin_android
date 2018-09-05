package optick.elisoft.com.newconoptik.ui.login

import dagger.Module
import dagger.Provides
import optick.elisoft.com.newconoptik.ui.login.contract.LoginContract
import optick.elisoft.com.newconoptik.ui.login.contract.LoginContractListener
import optick.elisoft.com.newconoptik.ui.login.presenter.LoginPresenter
import optick.elisoft.com.newconoptik.ui.login.presenter.LoginPresenterListener
import optick.elisoft.com.newconoptik.ui.login.view.LoginView

@Module
class LoginActivityModule{
    @Provides
    internal fun provideLoginContract(contract: LoginContract): LoginContractListener = contract

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter<LoginView, LoginContractListener>):
            LoginPresenterListener<LoginView, LoginContractListener> = presenter
}