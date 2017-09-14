package com.github.sherlock.wechatorder.buyerservice.exception

import com.github.sherlock.wechatorder.buyerservice.enums.ResponseStatusCode
import java.lang.RuntimeException

/**
 * Created by TangBin on 2017/9/14.
 */

class BuyerServiceException : RuntimeException {

  var code: Int? = null

  constructor(responseStatusCode: ResponseStatusCode) : super(responseStatusCode.message) {
    this.code = responseStatusCode.code
  }

  constructor(code: Int?, message: String) : super(message) {
    this.code = code
  }
}

