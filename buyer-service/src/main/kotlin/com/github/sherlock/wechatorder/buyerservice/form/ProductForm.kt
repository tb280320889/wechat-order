package com.github.sherlock.wechatorder.buyerservice.form

import java.math.BigDecimal

/**
 * Created by TangBin on 2017/9/14.
 */

data class ProductForm(
    var productId: String? = null,
    var productName: Int? = null,
    var productPriceId: BigDecimal? = null,
    var productStock: Int? = null,
    var productDescription: String? = null,
    var productIcon: String? = null,
    var categoryType: Int? = null
)
