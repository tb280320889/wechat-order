package com.github.sherlock.wechatorder.buyerservice.service.impl

import com.github.sherlock.wechatorder.buyerservice.domain.ProductInfo
import com.github.sherlock.wechatorder.buyerservice.repository.ProductInfoRepository
import com.github.sherlock.wechatorder.buyerservice.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service


@Service
class ProductServiceImpl @Autowired constructor(
    private val productInfoRepository: ProductInfoRepository
) : ProductService {

  override fun findById(productId: String): ProductInfo? {
    val optional = productInfoRepository.findById(productId)
    return if (optional.isPresent) optional.get() else null
  }

  override fun findUpAll(): List<ProductInfo> =
      productInfoRepository.findByProductStatus(ProductInfo.ProductStatusEnum.AVAILABLE.code)

  override fun findAll(pageable: Pageable): Page<ProductInfo> =
      productInfoRepository.findAll(pageable)

  override fun save(productInfo: ProductInfo): ProductInfo =
      productInfoRepository.save(productInfo)
}
