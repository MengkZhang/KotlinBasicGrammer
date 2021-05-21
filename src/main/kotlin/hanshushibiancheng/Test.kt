package hanshushibiancheng

var print = fun(name: String) {
    println(name)
}

/**
 * 函数式编程  - 告诫函数
 */
fun main() {
    /**
     * forEach(action: (T) -> Unit)
     * 参数：action是一个函数 没有返回值
     */
    val list = listOf<String>("zhang", "xiao", "lin")
    list.forEach(print)

    list.forEach {
        println(it)
    }
}