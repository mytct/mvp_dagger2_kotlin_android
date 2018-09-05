package optick.elisoft.com.newconoptik.util

import io.reactivex.ObservableTransformer
import io.reactivex.SingleTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SchedulerProvider{

    fun <T> ioToMainObservableScheduler(): ObservableTransformer<T, T> = ObservableTransformer {
        upstream -> upstream.subscribeOn(getIOThreadScheduler())
    }

    fun <T> ioToMainSingleScheduler(): SingleTransformer<T, T> = SingleTransformer {
        upstream -> upstream.subscribeOn(getIOThreadScheduler())
            .observeOn(getMainThreadScheduler())
    }

    private fun getIOThreadScheduler()= Schedulers.io()
    private fun getMainThreadScheduler()= AndroidSchedulers.mainThread()
}