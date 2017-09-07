package com.github.sherlock.wechatorder.eurekaserver

import lombok.extern.slf4j.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by TangBin on 2017/9/7.
 */

@SpringBootApplication
@EnableEurekaServer
@Slf4j
class WechatOrderEurekaServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(WechatOrderEurekaServerApplication::class.java, *args)
}

