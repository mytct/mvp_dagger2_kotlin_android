package optick.elisoft.com.newconoptik.ui.login.view

import optick.elisoft.com.newconoptik.ui.core.view.ICoreView

interface ILoginView : ICoreView{
    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}