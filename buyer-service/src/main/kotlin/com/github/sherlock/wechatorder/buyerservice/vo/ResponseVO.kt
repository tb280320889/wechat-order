package com.github.sherlock.wechatorder.buyerservice.vo

import java.io.Serializable

/**
 * Created by TangBin on 2017/9/14.
 */

data class ResponseVO<T>
(
    var code: Int? = null,
    var msg: String? = null,
    var data: T? = null
) : Serializable {

  companion object {

    private val serialVersionUID = -5848912345123L
  }
}
