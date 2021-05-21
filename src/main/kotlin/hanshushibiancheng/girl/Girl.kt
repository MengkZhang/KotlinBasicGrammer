package hanshushibiancheng.girl

data class Girl(var name: String, var age: Int, var height: Int, var address: String)

val girlData = getData()

fun getData(): List<Girl> {
    val list = ArrayList<Girl>()
    val sum = 0..30
    for (index in sum) {
        list.add(Girl("zhang$index", index, 160 + index, "chengdu$index"))
    }
    return list
}