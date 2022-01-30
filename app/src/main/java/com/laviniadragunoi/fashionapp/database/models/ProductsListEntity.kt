package com.laviniadragunoi.fashionapp.database.models

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class ProductsListEntity {

    @SerializedName("products")
    @Expose
    private var products: List<ProductEntity?>? = null
}