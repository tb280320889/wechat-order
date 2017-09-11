package com.github.sherlock.wechatorder.buyerservice.domain

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
  enum class ProductStatusEnum(val code: Int, val message: String) {

    AVAILABLE(0, "available"),
    PENDING(1, "pending")

  }
}
