package nulls

class Service {
    fun evaluate() {
        println("Evaluating...")
    }
}

class ServiceProvider {
    fun createService(test: Boolean): Service? {
        if (test)
            return Service()
        return null
    }
}

fun main() {
    printMessageLen("This is my awesome message")
    printMessageLen(null)
    printMessage("This is my awesome message")
    printMessage(null)

    val sp = ServiceProvider()
    val s = sp.createService(false)
    s?.evaluate()
    val ss = sp.createService(true)
    ss?.evaluate()
}

fun printMessageLen(message: String?) {
    println(message?.length ?: -1)
}

fun printMessage(message: String?) {
    if (message != null)
        println(message)
    else
        println("Message is empty")
}