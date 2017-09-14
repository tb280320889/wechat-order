package com.github.sherlock.wechatorder.buyerservice.controller

import com.github.sherlock.wechatorder.buyerservice.domain.ProductCategory
import com.github.sherlock.wechatorder.buyerservice.domain.ProductInfo
import com.github.sherlock.wechatorder.buyerservice.service.CategoryService
import com.github.sherlock.wechatorder.buyerservice.service.ProductService
import com.github.sherlock.wechatorder.buyerservice.utils.ResponseUtil.successResponse
import com.github.sherlock.wechatorder.buyerservice.vo.CategoryProductVO
import com.github.sherlock.wechatorder.buyerservice.vo.ResponseVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by TangBin on 2017/9/14.
 */

@RestController
@RequestMapping("buyer/products")
class BuyerProductController @Autowired constructor(
    private val productService: ProductService,
    private val categoryService: CategoryService
) {

  @GetMapping()
  fun list(): ResponseVO<List<CategoryProductVO>> {
    //1. query all available products
    val allAvailableProducts: List<ProductInfo> = productService.findAvailableAll()

    //2. query category
    val allCategoryList: List<Int> = allAvailableProducts.map { it.categoryType }.filterNotNull().distinct()
    val productCategoryList: List<ProductCategory> = categoryService.findByCategoryTypeIn(allCategoryList)

    //3. assemble object
    val categoryProductVOList = ArrayList<CategoryProductVO>()
    allAvailableProducts.groupByTo(mutableMapOf(), { it.categoryType }, { it.toProductVO() })
        .forEach { (categoryType, productVOList) ->
          val productCategory = productCategoryList.find { it.categoryType == categoryType }!!
          with(productCategory) {
            val categoryProductVO = CategoryProductVO()
            categoryProductVO.categoryName = categoryName
            categoryProductVO.categoryType = categoryType
            categoryProductVO.productVOList = productVOList
            categoryProductVOList.add(categoryProductVO)
          }
        }
    return successResponse(categoryProductVOList)
  }


}
