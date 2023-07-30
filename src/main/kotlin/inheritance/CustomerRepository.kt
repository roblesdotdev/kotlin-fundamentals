package inheritance

// interfaces cannot maintain state

interface CustomerRepository {
    var isEmpty: Boolean
    fun getById(id: Int): Customer
    fun store(customer: Customer)
}

class SQLCustomerRepository(override var isEmpty: Boolean = true) : CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(customer: Customer) {
        isEmpty = false;
    }
}

class APICustomerRepository(override var isEmpty: Boolean = true) : CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(customer: Customer) {
        isEmpty = false
    }
}

fun main() {
    val sr = SQLCustomerRepository()
    val ar = APICustomerRepository()
    println(execute(sr))
    println(execute(ar))
    println("Is empty: ${sr.isEmpty}")
    sr.store(Customer())
    println("Is empty: ${sr.isEmpty}")
}

fun execute(repo: CustomerRepository, id: Int = 1): Customer {
    return repo.getById(id)
}
