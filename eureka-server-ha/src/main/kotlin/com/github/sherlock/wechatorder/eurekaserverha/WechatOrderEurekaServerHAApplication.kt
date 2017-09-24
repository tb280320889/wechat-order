package com.github.sherlock.wechatorder.eurekaserverha

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by TangBin on 2017/9/24.
 */

@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
class WechatOrderEurekaServerHAApplication

fun main(args: Array<String>) {
  SpringApplication.run(WechatOrderEurekaServerHAApplication::class.java, *args)
}
