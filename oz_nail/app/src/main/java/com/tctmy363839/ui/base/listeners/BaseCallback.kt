package com.tctmy363839.ui.base.listeners

import com.tctmy363839.data.error.Error

/**
 * Created by ahmedeltaher on 3/22/17.
 */

interface BaseCallback {
    fun onSuccess(data: Any)

    fun onFail(error : Error)
}
