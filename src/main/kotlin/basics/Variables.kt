package basics

// var : mutable declaration
// val : immutable declaration(like const)

fun main() {
    var streetNumber: Int
    var streetName: String = "High Street"

    streetNumber = 1001

    println("The street is: $streetName - $streetNumber")

    val country = "Argentina"

    // country = "Uru"

    println("Welcome to $country")
}