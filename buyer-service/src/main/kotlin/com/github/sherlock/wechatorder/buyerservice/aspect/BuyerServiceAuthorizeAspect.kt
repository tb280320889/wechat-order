package com.github.sherlock.wechatorder.buyerservice.aspect

import com.github.sherlock.wechatorder.buyerservice.constant.CookieConstant
import com.github.sherlock.wechatorder.buyerservice.constant.ExceptionMessagePrefixConstant
import com.github.sherlock.wechatorder.buyerservice.constant.RedisConstant
import com.github.sherlock.wechatorder.buyerservice.exception.BuyerServiceAuthorizationException
import com.github.sherlock.wechatorder.buyerservice.utils.CookieUtil
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.jetbrains.kotlin.jline.internal.Log
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Component
import org.springframework.util.StringUtils
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

/**
 * Created by TangBin on 2017/9/14.
 */

@Aspect
@Component
class BuyerServiceAuthorizeAspect @Autowired constructor(
    private val stringRedisTemplate: StringRedisTemplate
) {

  @Pointcut("execution(public * com.github.sherlock.wechatorder.buyerservice.controller*.*(..)) ")
  fun verify() {}

  @Before("verify()")
  @Throws(BuyerServiceAuthorizationException::class)
  fun doVerify() {

    val attributes = RequestContextHolder.currentRequestAttributes() as ServletRequestAttributes

    // check cookie
    val cookie = CookieUtil.get(attributes.request, CookieConstant.TOKEN)

    if (cookie == null) {

      Log.warn("${ExceptionMessagePrefixConstant.LOGIN_AUTHORIZATION_ISSUE} can't find token in cookie")
      throw BuyerServiceAuthorizationException()
    }

    //check in redis
    val tokenValue: String? = stringRedisTemplate.opsForValue()
        .get(String.format(RedisConstant.TOKEN_PREFIX, cookie.value))

    if (StringUtils.isEmpty(tokenValue)) {
      Log.warn("${ExceptionMessagePrefixConstant.LOGIN_AUTHORIZATION_ISSUE} can't find token from redis")
      throw BuyerServiceAuthorizationException()
    }

  }

}

