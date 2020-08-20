package com.dxp


/**
 *
 *
 * @author carzy
 * @date 2020/8/20
 */
// 返回Int后携带?, 表示返回值有可能为null
fun parseInt(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun printProduct(x: String, y: String) {
    var x = parseInt(x)
    var y = parseInt(y)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("not number")
    }
}


// 类型检测与类型转换  is
fun funcStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

// 区间
fun fun1() {
    val a = 10
    val b = 9
    // 数字在不在区间内
    if (a in 1..b + 1) {
        println("fits in range")
    }
}
