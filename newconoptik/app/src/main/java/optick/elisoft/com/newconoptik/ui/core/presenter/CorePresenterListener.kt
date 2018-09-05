package optick.elisoft.com.newconoptik.ui.core.presenter

import optick.elisoft.com.newconoptik.ui.core.contract.CoreContractListener
import optick.elisoft.com.newconoptik.ui.core.view.CoreView

interface CorePresenterListener<V: CoreView?, I: CoreContractListener>{
    fun onAttach(view: V?)
    fun onDetach()
    fun getView(): V?
}