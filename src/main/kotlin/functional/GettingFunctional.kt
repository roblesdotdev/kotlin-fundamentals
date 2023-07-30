package functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val withReference = operation(3, 5, ::sum)
    println(withReference)

    val withLambda = operation(10, 20) { x, y -> x * y }
    println(withLambda)

    val result = unaryOperation(5) { it * it }
    println(result)
}