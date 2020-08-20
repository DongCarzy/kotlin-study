package com.dxp

/**
 * 集合操作
 *
 * @author carzy
 * @date 2020/8/20
 */

fun main() {
    // 只读 list
    val items: List<String> = listOf("a", "b", "c", "d")
    when {
        "a" in items -> println("aaaaaaaaaa")
        "b" in items -> println("bbbbbbbbb")
        "c" in items -> println("ccccccccc")
    }

    // 过滤
    items.filter { it.startsWith("a") }
            .sortedBy { it.length }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    // 只读map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
}