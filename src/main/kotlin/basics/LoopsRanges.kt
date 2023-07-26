package basics

fun main() {
    // .. is operator for rangeTo
    for(a: Int in 1..5) {
        print("$a ")
    }
    println()
    val nums = 1..4
    for (x in nums) {
        print("$x ")
    }
    println()

    for (count in 5 downTo 0) {
        print("$count ")
    }
    println()

    for (count in 0 until 4) {
        print("$count ")
    }
    println()

    val names = listOf("Mary", "Tom", "Luci")
    for (name in names) {
        println(name)
    }
}