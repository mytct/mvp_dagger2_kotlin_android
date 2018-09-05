package optick.elisoft.com.newconoptik.ui.login.view

import optick.elisoft.com.newconoptik.ui.core.view.CoreView

interface LoginView : CoreView{
    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}