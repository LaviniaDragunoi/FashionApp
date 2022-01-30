package com.laviniadragunoi.fashionapp.database

import androidx.room.Dao
import androidx.room.Query
import com.laviniadragunoi.fashionapp.database.models.ProductEntity

@Dao
interface ProductDao {
    @Query("SELECT * FROM product_table")
    fun getProduct():ProductEntity?

    @Query("SELECT * from product_table")
    fun getProductsList(): List<ProductEntity>?

    @Query("DELETE from product_table WHERE productId= :id")
    fun deleteProduct(id: Int)
}