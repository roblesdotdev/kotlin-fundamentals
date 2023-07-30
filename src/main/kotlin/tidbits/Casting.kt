package tidbits

open class Person {}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacations")
        }
    }
}

class Contractor: Person() {
    fun doStuff() {
        println("Contractor stuff")
    }
}

fun hasVacations(obj: Person) {
    if (obj is Employee) {
        // smart cast
        obj.vacationDays(30);
    }
}

fun main() {

}