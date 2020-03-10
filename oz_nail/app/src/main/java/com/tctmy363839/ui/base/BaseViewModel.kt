package com.tctmy363839.ui.base

import androidx.lifecycle.ViewModel
import com.tctmy363839.usecase.errors.ErrorManager


/**
 * Created by AhmedEltaher on 5/12/2016
 */


abstract class BaseViewModel : ViewModel() {
    /**Inject Singlton ErrorManager
     * Use this errorManager to get the Errors
     */
    abstract val errorManager: ErrorManager

}
