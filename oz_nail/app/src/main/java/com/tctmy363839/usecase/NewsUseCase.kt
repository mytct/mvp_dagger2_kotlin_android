package com.tctmy363839.usecase

import androidx.lifecycle.MutableLiveData
import com.tctmy363839.data.DataSource
import com.tctmy363839.data.Resource
import com.tctmy363839.data.error.Error.Companion.NETWORK_ERROR
import com.tctmy363839.data.remote.dto.NewsItem
import com.tctmy363839.data.remote.dto.NewsModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext


/**
 * Created by AhmedEltaher on 5/12/2016
 */

class NewsUseCase @Inject
constructor(private val dataRepository: DataSource, override val coroutineContext: CoroutineContext) : UseCase, CoroutineScope {
    private val newsMutableLiveData = MutableLiveData<Resource<NewsModel>>()
    override val newsLiveData: MutableLiveData<Resource<NewsModel>> = newsMutableLiveData


    override fun getNews() {
        var serviceResponse: Resource<NewsModel>?
        newsMutableLiveData.postValue(Resource.Loading())
        launch {
            try {
                serviceResponse = dataRepository.requestNews()
                newsMutableLiveData.postValue(serviceResponse)
            } catch (e: Exception) {
                newsMutableLiveData.postValue(Resource.DataError(NETWORK_ERROR))
            }
        }
    }

    override fun searchByTitle(keyWord: String): NewsItem? {
        val news = newsMutableLiveData.value?.data?.newsItems
        if (!news.isNullOrEmpty()) {
            for (newsItem in news) {
                if (newsItem.title.isNotEmpty() && newsItem.title.toLowerCase().contains(keyWord.toLowerCase())) {
                    return newsItem
                }
            }
        }
        return null
    }
}
