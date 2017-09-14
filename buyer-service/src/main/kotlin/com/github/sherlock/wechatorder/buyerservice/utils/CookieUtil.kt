package com.github.sherlock.wechatorder.buyerservice.utils

import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by TangBin on 2017/9/14.
 */

object CookieUtil {

  fun set(response: HttpServletResponse, name: String, value: String, maxAge: Int) {
    val cookie = Cookie(name, value)
    cookie.path = "/"
    cookie.maxAge = maxAge
    response.addCookie(cookie)
  }

  fun get(request: HttpServletRequest, name: String): Cookie? = request.cookies.associateBy { it.name }[name]

}
