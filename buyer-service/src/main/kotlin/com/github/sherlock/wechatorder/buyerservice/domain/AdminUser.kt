package com.github.sherlock.wechatorder.buyerservice.domain

import org.hibernate.annotations.DynamicUpdate
import java.sql.Timestamp
import javax.persistence.Entity
import javax.persistence.Id

/**
 * Created by TangBin on 2017/9/14.
 */

@Entity
@DynamicUpdate
data class AdminUser
(
    @Id var adminId: String? = null,
    var userName: String? = null,
    var password: String? = null,
    var openid: String? = null,
    var createTime: Timestamp? = null,
    var updateTime: Timestamp? = null
)
