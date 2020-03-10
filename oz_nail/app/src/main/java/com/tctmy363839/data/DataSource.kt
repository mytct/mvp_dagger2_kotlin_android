package com.tctmy363839.data

import com.tctmy363839.data.remote.dto.NewsModel

/**
 * Created by ahmedeltaher on 3/23/17.
 */

interface DataSource {
    suspend fun requestNews(): Resource<NewsModel>
}
