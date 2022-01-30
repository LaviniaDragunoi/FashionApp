package com.laviniadragunoi.fashionapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.laviniadragunoi.fashionapp.data.ApiInterface
import com.laviniadragunoi.fashionapp.database.AppDatabase
import com.laviniadragunoi.fashionapp.database.models.ProductEntity

class Repository(
    private val database: AppDatabase,
    private val appExecutors: AppExecutors,
    private val apiInterface: ApiInterface
) {
    init {
        appExecutors.diskIO().execute {
            productMutable.value = database.productDao.getProduct()
            productsMutableLD.value = database.productDao.getProductsList()
        }
    }

    private val productMutable = MutableLiveData<ProductEntity>()
    val productLD: LiveData<ProductEntity>
        get() = productMutable
    private val productsMutableLD = MutableLiveData<List<ProductEntity>>()
    val productLd: LiveData<List<ProductEntity>>
        get() = productsMutableLD

    fun fetchRetrofit(
        onSuccess: (product: ProductEntity) -> Unit
    ) {
        appExecutors.networkIO().execute {
            try {
                val response = apiInterface.getProducts().execute()
                when (response.code()) {
                    200 -> {

                    }
                }
            }  catch (exception: Exception) {
                Log.d("TAG", exception.message!!)
            }
        }

    }
}