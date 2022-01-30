package com.laviniadragunoi.fashionapp.database.models

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class ProductImagesEntity {

    @SerializedName("thumb")
    @Expose
    var thumb: List<String>? = null

    @SerializedName("zoom")
    @Expose
    var zoom: List<String>? = null
}
