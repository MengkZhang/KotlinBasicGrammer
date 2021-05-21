package hanshushibiancheng.girl

fun main() {
    //需求：找年龄最大的人
    //maxBy(selector: (T) -> R)
    println(girlData.maxBy {
        it.age
    })

    //找身高最低的人
    println(girlData.minBy {
        it.height
    })

    //filter
    //从集合中找出18岁以上&&168以上的所有人
    println(
        girlData.filter {
            (it.age > 18) and (it.height > 168)
        }
    )

    //map
    //把集合中所有的name和height取出来放到新的集合
    val  result = girlData.map {
        "${it.name} : ${it.height}"
    }
    println(result)

    //any
    //是否有18的人 true false
    println(
        girlData.any {
            it.age == 18
        }
    )

    //count
    //地址是chengdu0的人的个数
    println(girlData.count {
        it.address == "chengdu0"
    })

    //groupBy
    //找出地址是chengdu的所有人并排序
    girlData.groupBy {
        it.address
    }.get("chengdu")?.forEach {
        println(it)
    }

}