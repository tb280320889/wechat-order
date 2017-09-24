package com.github.sherlock.wechatorder.buyerservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * Created by TangBin on 2017/9/14.
 */

//@ConfigurationProperties(prefix = "projecturl")
//@Component
//class ProjectUrlConfig {
//  private var weChatWpAuthorize: String? = null
//    get
//    set
//  private var weChatOpenAuthorize: String? = null
//    get
//    set
//  private var buyerServiceUrl: String? = null
//    get
//    set
//}


@ConfigurationProperties(prefix = "projecturl")
@Component
data class ProjectUrlConfig  constructor(
    var weChatWpAuthorize: String? = null,
    var weChatOpenAuthorize: String? = null,
    var buyerServiceUrl: String? = null
) {
  constructor() : this(null)
}

