package com.github.sherlock.wechatorder.buyerservice.repository;

import com.github.sherlock.wechatorder.buyerservice.domain.AdminUser
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by TangBin on 2017/9/14.
 */

interface AdminUserRepository : JpaRepository<AdminUser, String> {
  fun findByOpenid(openid: String): AdminUser
}
