package optick.elisoft.com.newconoptik.ui.core.presenter

import android.util.Log
import io.reactivex.disposables.CompositeDisposable
import optick.elisoft.com.newconoptik.ui.core.contract.CoreContractListener
import optick.elisoft.com.newconoptik.ui.core.view.CoreView
import optick.elisoft.com.newconoptik.util.SchedulerProvider

abstract class CorePresenter<V: CoreView, I: CoreContractListener> internal constructor(protected var contract: I?,
                                                                                        protected val schedulerProvider: SchedulerProvider,
                                                                                        protected val compsiteDisposable: CompositeDisposable): CorePresenterListener<V, I>{
    private var view: V? = null
    private val isViewAttached: Boolean get()= view != null

    override fun onAttach(view: V?){
        this.view= view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compsiteDisposable.dispose()
        view= null
        contract= null
    }

    /**
     * example: Log.v("LoginPresenter", "clickLogin" + " " + "abc")
     */
    protected fun logData(tag: String, dataLog: String, prefix: String){
        Log.v(tag, prefix + " " + dataLog)
    }
}