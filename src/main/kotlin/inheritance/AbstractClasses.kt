package inheritance

abstract class StoreEntity {
    val isActive = true
    abstract fun store(): String

    fun status(): String {
        return isActive.toString()
    }
}

class Employee: StoreEntity() {
    override fun store(): String {
        return "Entity stored..."
    }
}

fun main() {
    val e = Employee()
    println(e.store())
    println(e.status())
}