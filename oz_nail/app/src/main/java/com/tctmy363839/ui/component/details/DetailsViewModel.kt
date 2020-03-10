package com.tctmy363839.ui.component.details

import androidx.lifecycle.MutableLiveData
import com.tctmy363839.data.error.mapper.ErrorMapper
import com.tctmy363839.data.remote.dto.NewsItem
import com.tctmy363839.ui.base.BaseViewModel
import com.tctmy363839.usecase.errors.ErrorManager
import javax.inject.Inject

/**
 * Created by AhmedEltaher on 11/12/16.
 */

class DetailsViewModel @Inject
constructor() : BaseViewModel() {
    var newsItem: MutableLiveData<NewsItem> = MutableLiveData()
    override val errorManager: ErrorManager
        get() = ErrorManager(ErrorMapper())
}
