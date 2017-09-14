package com.github.sherlock.wechatorder.buyerservice.service.impl

import com.github.sherlock.wechatorder.buyerservice.domain.AdminUser
import com.github.sherlock.wechatorder.buyerservice.repository.AdminUserRepository
import com.github.sherlock.wechatorder.buyerservice.service.AdminUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminUserServiceImpl @Autowired constructor(
    private val adminUserRepository: AdminUserRepository
) : AdminUserService {
  override fun findAdminUserByOpenid(openId: String): AdminUser? =
      adminUserRepository.findByOpenid(openId)
}
