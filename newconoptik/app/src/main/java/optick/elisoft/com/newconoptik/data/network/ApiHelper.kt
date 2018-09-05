package optick.elisoft.com.newconoptik.data.network

import io.reactivex.Observable
import optick.elisoft.com.newconoptik.data.network.param.login.LoginRequest
import optick.elisoft.com.newconoptik.data.network.response.LoginResponse

interface ApiHelper {
    fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>
}