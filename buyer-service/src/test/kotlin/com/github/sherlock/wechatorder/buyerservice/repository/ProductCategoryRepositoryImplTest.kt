package com.github.sherlock.wechatorder.buyerservice.repository

import com.github.sherlock.wechatorder.buyerservice.BuyerServiceApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by TangBin on 2017/9/10.
 */

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(BuyerServiceApplication::class))
class ProductCategoryRepositoryTest {

    @Autowired
    lateinit var productCategoryRepository: ProductCategoryRepository

    @Test
    fun findById() {

        productCategoryRepository.findById(1)
    }

}
