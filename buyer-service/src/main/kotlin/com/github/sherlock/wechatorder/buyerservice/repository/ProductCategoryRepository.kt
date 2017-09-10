package com.github.sherlock.wechatorder.buyerservice.repository

import com.github.sherlock.wechatorder.buyerservice.domain.ProductCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by TangBin on 2017/9/10.
 */

@Repository
interface ProductCategoryRepository : JpaRepository<ProductCategory, Int> {

    fun findByCategoryTypeIn(categoryTypeList: List<Int>): List<ProductCategory>


}
