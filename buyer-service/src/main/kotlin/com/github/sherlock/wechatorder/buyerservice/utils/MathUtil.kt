package com.github.sherlock.wechatorder.buyerservice.utils

/**
 * Created by TangBin on 2017/9/14.
 */


private const val MONEY_DIF_RANGE = 0.01

fun <T : Number> T.priceEquals(that: Number): Boolean = Math.abs(this.toDouble() - that.toDouble()) < MONEY_DIF_RANGE
