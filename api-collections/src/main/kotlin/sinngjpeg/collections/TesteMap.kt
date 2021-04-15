package sinngjpeg.collections

fun main() {
    //Map coleção de chaves e seus valores.

    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (t, u) -> println("Chave: $t Valor: $u") }

    println("----------------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { (t, u) -> println("Chave: $t Valor: $u") }
}