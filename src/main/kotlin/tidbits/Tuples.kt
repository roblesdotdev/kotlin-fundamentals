package tidbits

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair(country, 1_000_000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple(country, "America", 1_000_000)
}

data class CustomerKotlin(val firstname: String, val lastname: String)

fun main() {
   val result = capitalAndPopulation("Argentina")

    println(result.first)
    println(result.second)

    val info = countryInformation("Colombia")

    println(info.third)

    // deconstruct
    val (capital, population) = capitalAndPopulation("Mexico")
    println(capital)
    println(population)

    val (firstname, lastname) = CustomerKotlin("John", "Doe")
    println(firstname)
    println(lastname)

    // list of pairs
    val capitalsAndCountries = listOf(
        Pair("Buenos Aires", "Argentina"),
        "Santiago" to "Chile",
        "Brasilia" to "Brazil"
        )

    for ((cap, country) in capitalsAndCountries) {
       println("$cap, $country")
    }
}