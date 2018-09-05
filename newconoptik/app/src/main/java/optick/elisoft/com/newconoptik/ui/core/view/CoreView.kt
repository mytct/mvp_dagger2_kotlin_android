package optick.elisoft.com.newconoptik.ui.core.view

interface CoreView{
    fun showProgress()
    fun hideProgress()
    fun showErrorRequest(errorCode: Int)
}