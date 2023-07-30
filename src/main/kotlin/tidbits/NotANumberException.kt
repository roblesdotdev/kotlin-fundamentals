package tidbits

class NotANumberException(message: String = "Not a number") : Throwable(message) {
}

fun checkIsNumber(value: Any) {
    when (value) {
        !is Int, Long, Float, Double -> throw NotANumberException()
    }
}

fun main() {
    try {
        checkIsNumber("A")
    } catch (e: NotANumberException) {
        println(e.message)
    }
}