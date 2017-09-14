package com.github.sherlock.wechatorder.buyerservice.vo

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

/**
 * Created by TangBin on 2017/9/14.
 */

data class CategoryProductVO(
    @JsonProperty("name") var categoryName: String? = null,
    @JsonProperty("type") var categoryType: Int? = null,
    @JsonProperty("foods") var productVOList: List<ProductVO>? = null
) : Serializable {
  companion object {
    private val serialVersionUID = -5848921723482L
  }
}
