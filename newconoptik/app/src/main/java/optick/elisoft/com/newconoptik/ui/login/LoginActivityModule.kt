package optick.elisoft.com.newconoptik.ui.login

import dagger.Module
import dagger.Provides
import optick.elisoft.com.newconoptik.ui.login.contract.LoginInteractor
import optick.elisoft.com.newconoptik.ui.login.contract.ILoginInteractor
import optick.elisoft.com.newconoptik.ui.login.presenter.LoginPresenter
import optick.elisoft.com.newconoptik.ui.login.presenter.ILoginPresenter
import optick.elisoft.com.newconoptik.ui.login.view.ILoginView

@Module
class LoginActivityModule{
    @Provides
    internal fun provideLoginContract(contract: LoginInteractor): ILoginInteractor = contract

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter<ILoginView, ILoginInteractor>):
            ILoginPresenter<ILoginView, ILoginInteractor> = presenter
}