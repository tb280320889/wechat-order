package com.github.sherlock.wechatorder.buyerservice.domain

import com.github.sherlock.wechatorder.buyerservice.vo.ProductVO
import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by TangBin on 2017/9/11.
 */

@Entity
class ProductInfo(
    @Id
    var productId: String? = null,
    var productName: String? = null,
    var productPrice: BigDecimal? = null,
    var productStock: Int? = null,
    var productDescription: String? = null,
    var productIcon: String? = null,
    var productStatus: Int = ProductStatusEnum.AVAILABLE.code,
    var categoryType: Int? = null
) {

  fun toProductVO(): ProductVO {
    val productVO = ProductVO()
//  BeanUtils.copyProperties(this, productVO)

    productVO.productDescription = this.productDescription
    productVO.productIcon = this.productIcon
    productVO.productId = this.productId
    productVO.productName = this.productName
    productVO.productPrice = this.productPrice

    return productVO
  }

  enum class ProductStatusEnum(val code: Int, val message: String) {

    AVAILABLE(0, "available"),
    PENDING(1, "pending")

  }
}
