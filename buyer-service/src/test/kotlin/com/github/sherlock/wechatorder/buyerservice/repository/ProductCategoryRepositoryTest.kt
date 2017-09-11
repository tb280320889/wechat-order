package com.github.sherlock.wechatorder.buyerservice.repository

import com.github.sherlock.wechatorder.buyerservice.domain.ProductCategory
import org.jetbrains.kotlin.jline.internal.Log.info
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*
import javax.transaction.Transactional


/**
 * Created by TangBin on 2017/9/10.
 */

@RunWith(SpringRunner::class)
@SpringBootTest
class ProductCategoryRepositoryTest {

  @Autowired
  lateinit var productCategoryRepository: ProductCategoryRepository


  @Test
  fun findById() {

    val findById: Optional<ProductCategory> = productCategoryRepository.findById(1)
    val result = if (findById.isPresent) findById.get().toString() else null
    info(result)
  }

  @Test
  @Transactional
  fun saveTest() {
    val productCategory = ProductCategory()
    with(productCategory) {
      categoryName = "fruit"
      categoryType = 11
    }

    val save = productCategoryRepository.save(productCategory)

    assertNotNull(save)
  }

  @Test
  fun findByCategoryTypeInTest() {
    val list = listOf(1, 2, 3)

    val result: List<ProductCategory> = productCategoryRepository.findByCategoryTypeIn(list)

    assertNotEquals(0, result.size)
  }
}
