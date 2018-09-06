package optick.elisoft.com.newconoptik.ui.login.contract

import optick.elisoft.com.newconoptik.data.network.response.LoginResponse
import optick.elisoft.com.newconoptik.ui.core.contract.ICoreInteractor
import io.reactivex.Observable

interface ILoginInteractor : ICoreInteractor{

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>
}