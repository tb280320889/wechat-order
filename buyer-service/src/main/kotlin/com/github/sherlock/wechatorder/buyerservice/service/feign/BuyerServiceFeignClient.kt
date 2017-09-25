package com.github.sherlock.wechatorder.buyerservice.service.feign

import com.github.sherlock.wechatorder.buyerservice.vo.CategoryProductVO
import com.github.sherlock.wechatorder.buyerservice.vo.ResponseVO
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * Created by TangBin on 2017/9/25.
 */

@FeignClient(name = "wechat-order-buyer-service")
interface BuyerServiceFeignClient {
  @GetMapping("/{id}")
  fun findById(@PathVariable("id") id:Long): ResponseVO<List<CategoryProductVO>>


}
