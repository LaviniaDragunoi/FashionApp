package com.laviniadragunoi.fashionapp.data

import com.laviniadragunoi.fashionapp.database.models.ProductsListEntity
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("x-mobile-app-locale")
    fun getProducts(): Call<ProductsListEntity>

}