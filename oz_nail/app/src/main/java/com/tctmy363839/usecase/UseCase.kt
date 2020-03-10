package com.tctmy363839.usecase

import androidx.lifecycle.MutableLiveData
import com.tctmy363839.data.Resource
import com.tctmy363839.data.remote.dto.NewsItem
import com.tctmy363839.data.remote.dto.NewsModel

/**
 * Created by ahmedeltaher on 3/22/17.
 */

interface UseCase {
    fun getNews()
    fun searchByTitle(keyWord: String): NewsItem?
    val newsLiveData: MutableLiveData<Resource<NewsModel>>
}
