package com.tctmy363839.usecase.errors

import com.tctmy363839.data.error.Error

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}