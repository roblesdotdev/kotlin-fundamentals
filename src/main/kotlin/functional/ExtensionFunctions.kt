package functional

fun String.print() {
    println(this)
}

fun String.greet() {
    println("Hello, $this!")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main() {
   val s = "Hello"
    s.print()
    val name = "Mary Jane"
    name.greet()

    println("hello world".toTitleCase())
}