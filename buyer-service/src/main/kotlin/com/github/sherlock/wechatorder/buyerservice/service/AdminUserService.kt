package com.github.sherlock.wechatorder.buyerservice.service

import com.github.sherlock.wechatorder.buyerservice.domain.AdminUser

/**
 * Created by TangBin on 2017/9/14.
 */

interface AdminUserService {

  fun findAdminUserByOpenid(openId: String): AdminUser?
}
