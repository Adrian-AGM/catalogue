package com.luismunyoz.catalogue.data.repository.catalog.datasource.api

import com.luismunyoz.catalogue.data.repository.catalog.datasource.api.model.APICategory
import com.luismunyoz.catalogue.data.repository.catalog.datasource.api.model.APIProduct
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

interface ApiService {

    @Headers("secret-key: \$2a\$10\$/FnaPANNBKuyQd16QIfxDOd1PhWV07Jc8aYY6rf3Tg9okh00invMW")
    @GET("/b/5cb5a5270367e61b21b9d6d5/latest")
    fun getCategories(): Single<List<APICategory>>

    @Headers("secret-key: \$2a\$10\$/FnaPANNBKuyQd16QIfxDOd1PhWV07Jc8aYY6rf3Tg9okh00invMW")
    @GET
    fun getItems(@Url location: String): Single<List<APIProduct>>
}