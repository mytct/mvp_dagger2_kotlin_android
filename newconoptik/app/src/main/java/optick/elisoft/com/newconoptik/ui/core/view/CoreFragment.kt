package optick.elisoft.com.newconoptik.ui.core.view

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import dagger.android.support.AndroidSupportInjection
import optick.elisoft.com.newconoptik.util.CommonUtils

abstract class CoreFragment: Fragment(), ICoreView{
    private var parentActivity: CoreActivity?= null
    private var progressDialog: ProgressDialog?= null

    abstract fun initData()
    fun getCoreActivity() = parentActivity

    interface CallBack{
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is CoreActivity){
            val activity= context as CoreActivity?
            this.parentActivity= activity
            activity?.onFragmentAttached()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDI()
        setHasOptionsMenu(false)
    }

    override fun hideProgress() {
        if(progressDialog != null && progressDialog?.isShowing!!){
            progressDialog?.cancel()
        }
    }

    override fun showProgress() {
        hideProgress()
        progressDialog= CommonUtils.showLoadingDialog(this.context)
    }

    private fun initDI() = AndroidSupportInjection.inject(this)
}