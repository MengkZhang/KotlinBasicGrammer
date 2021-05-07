fun main(args: Array<String>) {
    println("Hello World!")
    val sum = sum(2, 3)
    println("sum is $sum")

    val maxOf = maxOf(2, 3)
    println("maxOf is $maxOf")

    nullCheck()

    println("----safe----")
    safe()
    println("----elvis----")
    elvis(null)

    //ttnull(null)//npe报错
}

fun sum(a: Int, b: Int) = a + b

fun maxOf(a: Int, b: Int) = if (a > b) a else b

/**----------------------空安全start---------------------------------------*/
fun nullCheck() {
    //默认情况下 常规初始化意味着非空
    var a: String = "abc"
    //编译错误
    //a = null

    //如果要允许一个字符串为空 需要这样写 String?
    var b: String? = "abc"
    b = null //OK的
    println(b)

    a.length//不会导致npe 放心使用
    //b.length//编译错误 可能导致npe

}

/**
 * 在条控中检查null
 */
fun checkNullInTiaoJian() {
    val b: String? = "kotlin"
    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }
}

/**
 * 安全调用 操作符号 写作 ?.
 */
fun safe() {
    val a = "kotlin"
    var b: String? = null
    println(b?.length)
    println(a.length)//无需安全调用

    //安全调用在链式调用中很有用  person?.department?.head = managersPool.getManager()
}

/**
 * Elvis操作符
 */
fun elvis(b: String?) {
    val l: Int = if (b != null) b.length else -1
    //除了完整的 if-表达式，这还可以通过 Elvis 操作符表达，写作 ?:
    val n = b?.length ?: -1

    println(n)
}

/**
 * !!操作符
 * 如果b为空则为抛出空指针异常npe
 */
fun ttnull(b: String?) {
    println("-----ttnull-----")
    val l = b!!.length
    println(l)
}

/**----------------------空安全end---------------------------------------*/