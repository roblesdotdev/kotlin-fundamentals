package inheritance

// In kotlin by default classes are final
// open allows inheritance

open class Person {
    // open allows override
    open fun validate() {

    }
}

open class Customer : Person() {

    // final disable override
    final override fun validate() {
        println("Validating...")
    }

    override fun toString(): String {
        return "Customer()"
    }
}

class SpecialCustomer : Customer() {
   // override fun validate() {}

    override fun toString(): String {
        return "SpecialCustomer()"
    }
}

fun main() {
    val c = Customer();
    val sc = SpecialCustomer()

    println(c)
    println(sc)
}