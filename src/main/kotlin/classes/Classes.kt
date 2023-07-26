package classes

/*
class Name(primary constructor) {
    init {
        initialize block
    }

    constructor() {
        // secondary constructor
        // each secondary constructor needs delegate to the primary constructor
        this()
    }

}

 */

fun main() {
    // Old style
    val m = Customer(1, "Mary Jane")
    val j = Customer(2, "John Doe")

    println(m)
    println(j)

    j.setName("John DD")
    println(j)

    // Short version
    val d = Customer_v2(3, "Day Smith")
    println(d)
    println(d.id)
    println(d.name)
    d.name = "Day F. Smith"
    println(d)

    // With getter and setters
    val sam = Customer_v3(4, yearOfBirth = 1999)
    println(sam)
    println("Age of sam is ${sam.age}")
    sam.socialCurrencyNumber = "SN-333"
    println(sam)

    // Data classes
    val mary = DataCustomer(5, "Mary Jane")
    println(mary)
    // destructuring properties
    val (maryId, maryName) = mary
    println("Mary(id: $maryId, name: $maryName)")
}
