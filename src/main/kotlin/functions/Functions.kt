package functions


// fun name(arg list) { body }
// default return type is Unit -> like void

fun main() {
    greet()
    greet("John Doe")
    greet(msg = "Bye")  // named params
    val sumResult = sum(3, 5)
    println("The sumResult is $sumResult")
    val mulResult = mul(3, 4)
    println("The mulResult is $mulResult")

    // varargs
    printStrings("one", "two", "three", "five")
    useSpread("six", "seven", "eight")
}

// param with default value
fun greet(name: String = "World", msg: String = "Hello") {
    println("$msg, $name!")
}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

// Single expression function
// infer return type
fun mul(a: Int, b: Int) = a * b

// Spread operator is *
fun useSpread(vararg strings: String) {
    printStrings(*strings)
}

// Varargs
fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}