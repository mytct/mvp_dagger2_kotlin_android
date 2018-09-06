package optick.elisoft.com.newconoptik.ui.core.view

interface ICoreView{
    fun showProgress()
    fun hideProgress()
    fun showErrorRequest(errorCode: Int)
}