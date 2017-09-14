package com.github.sherlock.wechatorder.buyerservice.controller

import com.github.sherlock.wechatorder.buyerservice.config.ProjectUrlConfig
import com.github.sherlock.wechatorder.buyerservice.constant.RedisConstant
import com.github.sherlock.wechatorder.buyerservice.enums.ResponseStatusCode
import com.github.sherlock.wechatorder.buyerservice.service.AdminUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView
import java.util.*
import java.util.concurrent.TimeUnit
import javax.servlet.http.HttpServletResponse

/**
 * Created by TangBin on 2017/9/14.
 */
@Controller
@RequestMapping("admin")
class BuyerServiceAdminUserController @Autowired constructor(
    private val stringRedisTemplate: StringRedisTemplate,
    private val adminUserService: AdminUserService,
    private val projectUrlConfig: ProjectUrlConfig
) {

  @GetMapping("login")
  fun login(@RequestParam("openid") openid: String, httpServletResponse: HttpServletResponse, viewMap: MutableMap<String, Any>): ModelAndView {

    val adminUser = adminUserService.findAdminUserByOpenid(openid)

    if (adminUser == null) {
      viewMap.put("msg", ResponseStatusCode.LOGIN_FAIL)
      viewMap.put("url", "wechat-order/buyer/products")
      return ModelAndView("common/error")
    }

    //save token into redis
    val token = UUID.randomUUID().toString()
    stringRedisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX, token), openid, RedisConstant.EXPIRE, TimeUnit.SECONDS)

    return ModelAndView("redirect:${projectUrlConfig.buyerServiceUrl}wechat-order/buyer/products")

  }


}
