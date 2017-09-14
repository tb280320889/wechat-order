package com.github.sherlock.wechatorder.buyerservice.enums

/**
 * Created by TangBin on 2017/9/14.
 */

enum class ResponseStatusCode
(val code: Int, val message: String) {
  SUCCESS(0, "success"),
  PARA_ERROR(1, "para is not correct "),
  PRODUCT_NOT_EXIST(10, "product not exists!"),
  PRODUCT_STOCK_ERROR(11, "invalid stock request!"),
  ORDER_NOT_EXIST(12, "order not exists!"),
  ORDER_DETAIL_NOT_EXIST(13, "order detail not exists!"),
  ORDER_STATUS_ERROR(14, "order status error"),
  ORDER_UPDATE_FAIL(15, "order update failed"),
  ORDER_DETAIL_EMPTY(16, "order detail empty"),
  ORDER_PAY_STATUS_ERROR(17, "order pay status error"),
  CART_EMPTY(18, "cart is empty!"),
  ORDER_OWNER_ERROR(19, "openid matches failed"),
  WECHAT_MP_ERROR(20, "weChat mp error"),
  WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21, "wxpay notify money verify error"),
  ORDER_CANCEL_SUCCESS(22, "order cancel  successfully"),
  ORDER_FINISH_SUCCESS(23, "order finish  successfully"),
  LOGIN_FAIL(25, "login fail"),
  LOGOUT_SUCCESS(26, "logout successfully"),
  PRODUCT_STATUS_ERROR(24, "product_status_error"),

}
