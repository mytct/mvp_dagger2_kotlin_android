package com.tctmy363839.data

import com.tctmy363839.data.local.LocalRepository
import com.tctmy363839.data.remote.RemoteRepository
import com.tctmy363839.data.remote.dto.NewsModel
import javax.inject.Inject


/**
 * Created by AhmedEltaher on 5/12/2016
 */

class DataRepository @Inject
constructor(private val remoteRepository: RemoteRepository, private val localRepository: LocalRepository) : DataSource {

    override suspend fun requestNews(): Resource<NewsModel> {
        return remoteRepository.requestNews()
    }
}
