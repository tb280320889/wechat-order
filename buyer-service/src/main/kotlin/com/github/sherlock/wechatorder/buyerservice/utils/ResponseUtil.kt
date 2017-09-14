package com.github.sherlock.wechatorder.buyerservice.utils

import com.github.sherlock.wechatorder.buyerservice.vo.ResponseVO

/**
 * Created by TangBin on 2017/9/14.
 */

object ResponseUtil {

  fun <T> successResponse(data: T? = null): ResponseVO<T> = ResponseVO(0, "success", data)

  fun <T> errorResponse(code: Int, msg: String): ResponseVO<T> = ResponseVO(code, msg, null)
}
