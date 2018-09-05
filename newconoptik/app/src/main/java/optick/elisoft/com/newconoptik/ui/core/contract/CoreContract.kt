package optick.elisoft.com.newconoptik.ui.core.contract

import optick.elisoft.com.newconoptik.data.preferences.PreferenceHelper
import optick.elisoft.com.newconoptik.data.network.ApiHelper

open class CoreContract(): CoreContractListener{
    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var apiHelper: ApiHelper

    constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper): this(){
        this.preferenceHelper= preferenceHelper
        this.apiHelper= apiHelper
    }

    override fun isUserLogged(): Boolean {
        return false
    }

    override fun performUserLogout() {
        preferenceHelper.let{
            it.setAccessToken(null)
            it.setCurrentUserEmail(null)
        }
    }

}