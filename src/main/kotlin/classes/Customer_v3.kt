package classes

import java.util.Calendar

class Customer_v3(val id: Int, val yearOfBirth: Int, var name: String = "Unknown") {
    init {
        this.name = name.uppercase()
    }

    override fun toString(): String {
        return "Customer_v3(id: $id, name: $name, sn: $socialCurrencyNumber)"
    }

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialCurrencyNumber = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Invalid social number")
            }
            field = value
        }
}