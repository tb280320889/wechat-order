package com.github.sherlock.wechatorder.apigatewayzuul

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

/**
 * Created by TangBin on 2017/9/7.
 */

@SpringBootApplication
@EnableZuulProxy
class WechatOrderZuulApplication

fun main(args: Array<String>) {
    SpringApplication.run(WechatOrderZuulApplication::class.java, *args)
}
