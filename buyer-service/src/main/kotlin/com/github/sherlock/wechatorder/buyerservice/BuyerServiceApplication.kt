package com.github.sherlock.wechatorder.buyerservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

/**
 * Created by TangBin on 2017/9/10.
 */

@SpringBootApplication
@EnableDiscoveryClient
class BuyerServiceApplication {

  @Bean
  @LoadBalanced
  fun restTemplate(): RestTemplate = RestTemplate()

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      SpringApplication.run(BuyerServiceApplication::class.java, *args)
    }
  }

}
