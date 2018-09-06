package optick.elisoft.com.newconoptik.ui.login.contract

import optick.elisoft.com.newconoptik.data.preferences.PreferenceHelper
import io.reactivex.Observable
import optick.elisoft.com.newconoptik.data.network.AppApiHelper
import optick.elisoft.com.newconoptik.data.network.param.login.LoginRequest
import optick.elisoft.com.newconoptik.data.network.response.LoginResponse
import optick.elisoft.com.newconoptik.ui.core.contract.CoreInteractor
import javax.inject.Inject

class LoginInteractor @Inject internal constructor(
        preferenceHelper: PreferenceHelper,
        apiHelper: AppApiHelper): CoreInteractor(
        preferenceHelper, apiHelper), ILoginInteractor
{
    override fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse> =
            apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email, password))
}