package com.tctmy363839.ui.component.splash

import com.tctmy363839.data.error.mapper.ErrorMapper
import com.tctmy363839.ui.base.BaseViewModel
import com.tctmy363839.usecase.errors.ErrorManager
import javax.inject.Inject

/**
 * Created by AhmedEltaher on 5/12/2016
 */

class SplashViewModel @Inject
constructor() : BaseViewModel(){
    override val errorManager: ErrorManager
        get() = ErrorManager(ErrorMapper())
}
