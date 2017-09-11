package com.github.sherlock.wechatorder.buyerservice.repository

import com.github.sherlock.wechatorder.buyerservice.domain.ProductInfo
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.math.BigDecimal

/**
 * Created by TangBin on 2017/9/11.
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ProductInfoRepositoryTest {

  @Autowired
  lateinit var productInfoRepository: ProductInfoRepository


  @Test
  fun `should save`() {

    with(ProductInfo()) {
      productId = "123456"
      productName = "omelet"
      productPrice = BigDecimal(3.2)
      productDescription = "nice for breakfast"
      productStock = 233
      productIcon = "http://xxx.jpg"
      productStatus = 0
      categoryType = 1
      val save = productInfoRepository.save(this)
      assertNotNull(save)
    }

  }

  @Test
  fun findByProductStatus() {

    val productInfoList = productInfoRepository.findByProductStatus(0)
    assertNotEquals(0, productInfoList.size)

  }

}
