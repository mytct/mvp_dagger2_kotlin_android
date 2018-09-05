package optick.elisoft.com.newconoptik.data.network

import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Observable
import optick.elisoft.com.newconoptik.data.network.param.login.LoginRequest
import optick.elisoft.com.newconoptik.data.network.response.LoginResponse
import javax.inject.Inject

class AppApiHelper @Inject constructor(private val apiHeader: ApiHeader) : ApiHelper{

    override fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse> =
            Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
                    .addHeaders(apiHeader.publicApiHeader)
                    .addBodyParameter(request)
                    .build()
                    .getObjectObservable(LoginResponse::class.java)
}