package basics

fun main() {
    val num = 2
    if (isOdd(num)) {
        println("$num is odd")
    }

    ifExpression(num)

    println(dayString(1))
    println(dayString(33))
}

fun ifExpression(num: Int) {
    val message = if (isOdd(num)) {
        "Nice $num is odd"
    } else {
        "Ups!"
    }
    println(message)
}

fun isOdd(n: Int): Boolean {
    return n % 2 == 0
}

fun dayString(dayNum : Int) : String{
    return when(dayNum)  {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day number"
    }
}
