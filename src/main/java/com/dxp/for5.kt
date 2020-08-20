package com.dxp

/**
 *
 *
 * @author carzy
 * @date 2020/8/20
 */
fun fun2() {
    // 区间迭代
    for (c in 1..10) {
        print(c)
    }
}

// 数列迭代
fun fun3() {
    // 区间迭代, 不进2
    for (c in 1..10 step 2) {
        print(c)
    }
}

fun fun4() {
    // 从9到0每次步进为2
    for (c in 9 downTo 0 step 2) {
        print(c)
    }
}

fun main() {
    fun4()
}