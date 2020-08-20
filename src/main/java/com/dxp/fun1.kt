package com.dxp

/**
 * 函数
 *
 * @author carzy
 * @date 2020/8/20
 */
/**
 * 自动推断返回类型
 */
fun sum(a: Int, b: Int): Int = a + b

/**
 * 无返回值时,则返回Unit,可省略
 */
fun printInt(a: Int): Unit {
    println("sum: $a")
}

fun main() {
    val sum = sum(1, 3)
    printInt(sum)
}