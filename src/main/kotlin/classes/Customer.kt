package classes

class Customer(initID: Int, initName: String = "Unknown") {
    private val id: Int = initID;
    private var name: String = initName;

    override fun toString(): String {
        return "Customer(id: $id, name: $name)"
    }

    fun setName(name: String) {
        this.name = name
    }
}
