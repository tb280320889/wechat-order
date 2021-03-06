package com.github.sherlock.wechatorder.eurekaserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by TangBin on 2017/9/7.
 */

@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
class WechatOrderEurekaServerApplication

fun main(args: Array<String>) {
  SpringApplication.run(WechatOrderEurekaServerApplication::class.java, *args)
}

