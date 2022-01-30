package com.laviniadragunoi.fashionapp.database.models

import androidx.room.Entity
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


@Entity(tableName = "product_table")
class ProductEntity {

    @SerializedName("product_id")
    @Expose
    var productId: Int? = null

    @SerializedName("product_brand")
    @Expose
    var productBrand: String? = null

    @SerializedName("product_name")
    @Expose
    var productName: String? = null

    @SerializedName("product_images")
    @Expose
    var productImages: ProductImagesEntity? = null
}