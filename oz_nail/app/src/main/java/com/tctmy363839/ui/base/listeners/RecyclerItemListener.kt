package com.tctmy363839.ui.base.listeners

import com.tctmy363839.data.remote.dto.NewsItem

/**
 * Created by AhmedEltaher on 5/12/2016
 */

interface RecyclerItemListener {
    fun onItemSelected(newsItem: NewsItem)
}
