package com.github.sherlock.wechatorder.buyerservice.service

import com.github.sherlock.wechatorder.buyerservice.domain.ProductInfo
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

/**
 * Created by TangBin on 2017/9/11.
 */

interface ProductService {

  fun findById(productId : String ): ProductInfo?

  fun findAvailableAll() : List<ProductInfo>

  fun findAll(pageable: Pageable): Page<ProductInfo>

  fun save(productInfo: ProductInfo):ProductInfo
}
