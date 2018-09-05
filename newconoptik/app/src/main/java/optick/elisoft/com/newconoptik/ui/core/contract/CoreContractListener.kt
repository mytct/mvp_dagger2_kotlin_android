package optick.elisoft.com.newconoptik.ui.core.contract

interface CoreContractListener{
    fun isUserLogged(): Boolean
    fun performUserLogout()
}