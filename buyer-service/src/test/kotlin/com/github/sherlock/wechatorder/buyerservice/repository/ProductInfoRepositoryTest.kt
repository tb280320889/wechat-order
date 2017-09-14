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

    val list: List<ProductInfo> = (0..30).map {
      val productInfo = ProductInfo()
      with(productInfo) {
        productId = (it * 100).toString()
        productName = (it * 10).toString() + "name"
        productPrice = BigDecimal(it + 0.01)
        productDescription = "description" + it
        productStock = it
        productIcon = "http://xxx$it.jpg"
        productStatus = it.rem(2)
        categoryType = it.rem(5)
      }
      productInfo
    }

    val save = productInfoRepository.saveAll(list)
    assertNotNull(save)

  }

  @Test
  fun findByProductStatus() {

    val productInfoList = productInfoRepository.findByProductStatus(0)
    assertNotEquals(0, productInfoList.size)

  }

}
