package com.github.sherlock.wechatorder.buyerservice.service.impl

/**
 * Created by TangBin on 2017/9/11.
 */
import com.github.sherlock.wechatorder.buyerservice.domain.ProductInfo
import com.github.sherlock.wechatorder.buyerservice.service.ProductService
import org.jetbrains.kotlin.jline.internal.Log.info
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import org.springframework.test.context.junit4.SpringRunner
import java.math.BigDecimal

@RunWith(SpringRunner::class)
@SpringBootTest
class ProductServiceImplTest {

  @Autowired
  private lateinit var productService: ProductService

  @Test
  fun findById() {
    val productInfo = productService.findById("123456")
    assertEquals("123456", productInfo!!.productId)
  }

  @Test
  fun findUpAll() {
    val productInfoList = productService.findUpAll()
    assertNotEquals(productInfoList.size, 0)
  }

  @Test
  fun findAll() {
    val pageRequest = PageRequest.of(0, 2)
    val all = productService.findAll(pageRequest)
    info(all.totalElements)
  }

  @Test
  fun save() {
    with(ProductInfo()) {
      productId = "12345"
      productName = "soup"
      productPrice = BigDecimal(2.3)
      productStock = 100
      productDescription = "nice soup!"
      productIcon = "http://xxxx.jpg"
      productStatus = ProductInfo.ProductStatusEnum.PENDING.code


      val save = productService.save(this)
      assertNotNull(save)

    }
  }

}
