package com.github.sherlock.wechatorder.buyerservice.config.loadbalancerule

import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.RandomRule
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by TangBin on 2017/9/25.
 */

@Configuration
class BuyerServiceRibbonConfiguration {
  @Bean
  fun ribbonRule(): IRule = RandomRule()
}



@Configuration
@RibbonClient(name = "wechat-order-buyer-service",
    configuration = arrayOf(BuyerServiceRibbonConfiguration::class))
class ActivateRule
