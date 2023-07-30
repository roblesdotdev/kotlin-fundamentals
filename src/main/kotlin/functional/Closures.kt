package functional

fun outsideFunction(): Int {
    val number = 10;
    return unaryOperation(20) { it * number }
}

fun outSide2() {
    for (num in 1..5) {
        println(unaryOperation(num) { it * it })
    }
}

fun main() {
    val result = outsideFunction()
    println(result)

    outSide2()
}