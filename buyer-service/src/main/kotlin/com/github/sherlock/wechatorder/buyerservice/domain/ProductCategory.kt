package com.github.sherlock.wechatorder.buyerservice.domain


import org.hibernate.annotations.DynamicUpdate
import java.sql.Timestamp
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by TangBin on 2017/9/10.
 */


@Entity
@DynamicUpdate
class ProductCategory {

    /**
     *
     */
    @Id
    @GeneratedValue
    var categoryId: Int? = null

    /**
     *
     */
    var categoryName: String? = null
    /**
     *
     */
    var categoryType: Int? = null
    /**
     *
     */
    var createTime: Timestamp? = null
    /**
     *
     */
    var updateTime: Timestamp? = null

}
