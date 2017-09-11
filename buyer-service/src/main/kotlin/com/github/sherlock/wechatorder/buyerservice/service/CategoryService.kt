package com.github.sherlock.wechatorder.buyerservice.service

import com.github.sherlock.wechatorder.buyerservice.domain.ProductCategory

/**
 * Created by TangBin on 2017/9/11.
 */


interface CategoryService {

    fun findById(categoryId: Int): ProductCategory?

    fun findAll(): List<ProductCategory>

    fun findByCategoryTypeIn(categoryTypeList: List<Int>): List<ProductCategory>

    fun save(productCategory: ProductCategory): ProductCategory

}
