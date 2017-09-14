package com.github.sherlock.wechatorder.buyerservice.vo

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.math.BigDecimal

/**
 * Created by TangBin on 2017/9/14.
 */

data class ProductVO(
    @JsonProperty("id") var productId: String? = null,
    @JsonProperty("name") var productName: String? = null,
    @JsonProperty("price") var productPrice: BigDecimal? = null,
    @JsonProperty("description") var productDescription: String? = null,
    @JsonProperty("icon") var productIcon: String? = null
) : Serializable {
  companion object {
    private val serialVersionUID = -58489231231758L
  }
}
