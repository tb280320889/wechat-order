package com.github.sherlock.wechatorder.buyerservice.service.impl

import com.github.sherlock.wechatorder.buyerservice.service.CategoryService
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by TangBin on 2017/9/11.
 */

/**
 * liveTemplate
 * @RunWith(SpringRunner::class)
@SpringBootTest
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class CategoryServiceImplTest {

  /**
   * liveTemplate
   * @Autowired
  private lateinit var $NAME$ : $UPCASE$
  $END$
   */
  @Autowired
  private lateinit var categoryService: CategoryService

  @Test
  fun `should find one by id`() {
    val productCategory = categoryService.findById(1)
    assertEquals(1, productCategory!!.categoryId)
  }

  @Test
  fun `should find all`() {

  }

  @Test
  fun `should find By Category Type In`() {
  }

  @Test
  fun save() {
  }

  @Test
  fun getProductCategoryRepository() {
  }

}
