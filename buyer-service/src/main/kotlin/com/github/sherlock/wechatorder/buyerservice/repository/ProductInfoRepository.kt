package com.github.sherlock.wechatorder.buyerservice.repository

import com.github.sherlock.wechatorder.buyerservice.domain.ProductInfo
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by TangBin on 2017/9/11.
 */

interface ProductInfoRepository : JpaRepository<ProductInfo, String> {
  fun findByProductStatus(productStatus: Int): List<ProductInfo>

}
