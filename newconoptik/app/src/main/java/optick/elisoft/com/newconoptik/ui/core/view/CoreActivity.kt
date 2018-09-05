package optick.elisoft.com.newconoptik.ui.core.view

import android.app.ProgressDialog
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import optick.elisoft.com.newconoptik.util.AppConstants
import optick.elisoft.com.newconoptik.util.CommonUtils

abstract class CoreActivity: AppCompatActivity(), CoreView, CoreFragment.CallBack{
    private var progressDialog: ProgressDialog?= null

    abstract fun getContentViewId(): Int
    abstract fun initPresenter()
    abstract fun removePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDI()
        setContentView(getContentViewId())
        initPresenter()
        initLayout()
    }

    /**
     * refresh layout, init listeners or somethings else
     */
    open fun initLayout() {
    }

    override fun onDestroy() {
        removePresenter()
        super.onDestroy()
    }

    override fun hideProgress() {
        progressDialog?.let{
            if(it.isShowing) {
                it.cancel()
            }
        }
    }

    override fun showProgress() {
        hideProgress()
        progressDialog= CommonUtils.showLoadingDialog(this)
    }

    private fun initDI() = AndroidInjection.inject(this)

    override fun showErrorRequest(errorCode: Int) {
        when(errorCode){
            AppConstants.API_ERROR->{

            }
        }

    }
}