package com.laviniadragunoi.fashionapp.data

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val BASE_URL = "https://m.fashiondays.com/mobile/8/g/women/clothing/"
    private var retrofit: Retrofit? = null

    val client: Retrofit
        get() {
            val client = OkHttpClient()
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
}