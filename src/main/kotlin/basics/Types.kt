package basics

fun main() {
    val myLong = 10L   // suffix L
    val myFloat = 10F  // suffix F
    val myDouble = 10.0
    val myHex = 0x0F  // prefix 0x
    val myBinary = 0b00001011  // prefix 0b
    val myInt = 1

    val message = "This is my best string"  // String -> double quotes ""
    val multiLineMessage = """
        This is my multi
        line string
    """.trimIndent()

    println("The message is -> $message")  // interpolation with $
    println(multiLineMessage)

    println("Upper message -> ${message.uppercase()}")  // operation with ${}

    val isAdmin = false  // Boolean
    println(if (isAdmin) "Is Admin" else "Forbidden")

    val myChar = 'A'  // Char -> single quotes ''
    println(myChar)

    integerTypes()
    floatingPoint()
}

fun integerTypes() {
    println("Byte  -> 8 bits")
    println("Short -> 16 bits")
    println("Int   -> 32 bits")
    println("Long  -> 64 bits")
}

fun floatingPoint() {
    println("Float  ->  32 bits")
    println("Double ->  64 bits")
}