package com.github.sherlock.wechatorder.buyerservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * Created by TangBin on 2017/9/10.
 */

@SpringBootApplication
@EnableDiscoveryClient
class BuyerServiceApplication

fun main(args: Array<String>) {
  SpringApplication.run(BuyerServiceApplication::class.java, *args)
}
