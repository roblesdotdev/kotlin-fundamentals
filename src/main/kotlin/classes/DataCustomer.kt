package classes

// Data classes: It is not unusual to create classes whose main purpose is to hold data.
// In such classes, some standard functionality and some utility functions are often mechanically
// derivable from the data. In Kotlin, these are called data classes and are marked with data:
data class DataCustomer(val id: Int, var name: String)

// The compiler automatically derives the following members from all properties declared in the primary constructor:
//
// equals() / hashCode()
//
// toString() of the form "DataCustomer(id=1, name="John Doe")"
//
// componentN() functions corresponding to the properties in their order of declaration.
//
// copy() function (see below).
