package com.github.sherlock.wechatorder.buyerservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * Created by TangBin on 2017/9/14.
 */

@Component
@ConfigurationProperties(prefix = "projectUrl")
data class ProjectUrlConfig
(var weChatWpAuthorize: String,
 var weChatOpenAuthorize: String,
 var buyerServiceUrl: String
)
