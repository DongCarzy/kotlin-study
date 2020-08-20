package com.dxp

/**
 *
 *
 * @author carzy
 * @date 2020/8/20
 */
fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun maxOf1(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxOf2(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}