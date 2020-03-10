package com.tctmy363839.data.remote

import com.tctmy363839.data.Resource
import com.tctmy363839.data.remote.dto.NewsModel

/**
 * Created by ahmedEltaher on 3/23/17.
 */

internal interface RemoteSource {
    suspend fun requestNews(): Resource<NewsModel>
}
