package inheritance

interface DefaultRepository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
    fun store(value: T)
}

class EmployeeRepository: DefaultRepository<Employee> {
    override fun getById(id: Int): Employee {
        return Employee()
    }

    override fun getAll(): List<Employee> {
        return listOf(Employee())
    }

    override fun store(value: Employee) {
        println("Storing $value")
    }

}

fun main() {
    val er = EmployeeRepository()
    println(er.getAll())
    println(er.getById(1))
    er.store(Employee())
}