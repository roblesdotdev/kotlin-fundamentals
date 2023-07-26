package classes

enum class Prioriry {
    MINOR,
    NORMAL,
    CRITICAL,
}

fun main() {
   val priority = Prioriry.NORMAL

    val status = checkPriority(priority)
    println(status)
}

fun checkPriority(priority: Prioriry): String {
    return when (priority) {
        Prioriry.MINOR -> "Don't worry"
        Prioriry.NORMAL -> "Normal"
        Prioriry.CRITICAL -> "CRITICAL!!!!!"
    }
}

