package optick.elisoft.com.newconoptik.ui.core.presenter

import optick.elisoft.com.newconoptik.ui.core.contract.ICoreInteractor
import optick.elisoft.com.newconoptik.ui.core.view.ICoreView

interface ICorePresenter<V: ICoreView?, I: ICoreInteractor>{
    fun onAttach(view: V?)
    fun onDetach()
    fun getView(): V?
}