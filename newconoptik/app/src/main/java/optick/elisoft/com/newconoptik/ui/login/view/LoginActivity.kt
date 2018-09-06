package optick.elisoft.com.newconoptik.ui.login.view

import kotlinx.android.synthetic.main.activity_login.*
import optick.elisoft.com.newconoptik.R
import optick.elisoft.com.newconoptik.ui.core.view.CoreActivity
import optick.elisoft.com.newconoptik.ui.login.contract.ILoginInteractor
import optick.elisoft.com.newconoptik.ui.login.presenter.LoginPresenter
import optick.elisoft.com.newconoptik.util.AppConstants
import javax.inject.Inject

class LoginActivity : CoreActivity(), ILoginView{
    override fun initPresenter() {
        presenter.onAttach(this)
    }

    override fun removePresenter() {
        presenter.onDetach()
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_login
    }

    override fun initLayout() {
        btnLogin.setOnClickListener {
            presenter.onServerLoginClicked(edtUsername.text.toString(), edtPassword.text.toString())
        }
    }

    @Inject
    lateinit var presenter: LoginPresenter<ILoginView, ILoginInteractor>

    override fun onFragmentAttached() {
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun showValidationMessage(errorCode: Int) {
        when(errorCode){
            AppConstants.EMPTY_EMAIL_ERROR->{
                //display empty email here
            }
            AppConstants.EMPTY_PASSWORD_ERROR->{
                //display empty password here
            }
        }
    }

    override fun openMainActivity() {
    }

}