package optick.elisoft.com.newconoptik.ui.login.presenter

import android.util.Log
import com.google.gson.Gson
import io.reactivex.disposables.CompositeDisposable
import optick.elisoft.com.newconoptik.ui.core.presenter.CorePresenter
import optick.elisoft.com.newconoptik.ui.login.contract.LoginContractListener
import optick.elisoft.com.newconoptik.ui.login.view.LoginView
import optick.elisoft.com.newconoptik.util.AppConstants
import optick.elisoft.com.newconoptik.util.SchedulerProvider
import javax.inject.Inject

class LoginPresenter<V : LoginView, I : LoginContractListener> @Inject internal constructor(
        contract: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : CorePresenter<V,I>(
        contract = contract, schedulerProvider = schedulerProvider, compsiteDisposable = disposable), LoginPresenterListener<V,I>{

    override fun onServerLoginClicked(email: String, password: String) {
        when{
            email.isEmpty()-> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty()-> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else->{
                getView()?.showProgress()
                contract?.let{
                    compsiteDisposable.add(it.doServerLoginApiCall(email, password)
                            .compose(schedulerProvider.ioToMainObservableScheduler())
                            .subscribe({
                                loginResponse->
                                //action login done
                                logData("LoginPresenter", Gson().toJson(loginResponse),"onServerLoginClicked")
                                getView()?.hideProgress()
                                getView()?.openMainActivity()
                            }, {
                                err ->
                                //display error here
                                logData("LoginPresenter", err.toString(),"onServerLoginClicked")
                                getView()?.hideProgress()
                                getView()?.showErrorRequest(AppConstants.API_ERROR)
                            }))
                }
            }
        }
    }
}