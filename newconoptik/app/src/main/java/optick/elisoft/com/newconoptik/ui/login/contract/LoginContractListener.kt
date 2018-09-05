package optick.elisoft.com.newconoptik.ui.login.contract

import optick.elisoft.com.newconoptik.data.network.response.LoginResponse
import optick.elisoft.com.newconoptik.ui.core.contract.CoreContractListener
import io.reactivex.Observable

interface LoginContractListener : CoreContractListener{

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>
}