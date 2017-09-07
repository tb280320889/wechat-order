package com.github.sherlock.wechatorder.turbine

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.netflix.turbine.EnableTurbine

/**
 * Created by TangBin on 2017/9/7.
 */

@SpringBootApplication
@EnableTurbine
class WechatOrderTurbineApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(WechatOrderTurbineApplication::class.java).web(WebApplicationType.SERVLET).run(*args)
}
