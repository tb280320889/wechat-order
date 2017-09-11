package com.github.sherlock.wechatorder.buyerservice.service.impl

import com.github.sherlock.wechatorder.buyerservice.domain.ProductCategory
import com.github.sherlock.wechatorder.buyerservice.repository.ProductCategoryRepository
import com.github.sherlock.wechatorder.buyerservice.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoryServiceImpl @Autowired constructor(
    private val productCategoryRepository: ProductCategoryRepository
) : CategoryService {

  override fun findById(categoryId: Int): ProductCategory? {
    val one: Optional<ProductCategory> = productCategoryRepository.findById(categoryId)
    return if (one.isPresent) one.get() else null
  }

  override fun findAll(): List<ProductCategory> = productCategoryRepository.findAll()

  override fun findByCategoryTypeIn(categoryTypeList: List<Int>): List<ProductCategory> =
      productCategoryRepository.findByCategoryTypeIn(categoryTypeList)

  override fun save(productCategory: ProductCategory): ProductCategory =
      productCategoryRepository.save(productCategory)
}
