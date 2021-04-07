package one.digitalinnovation.digionebank

data class Pessoa(
    var nome: String = "Ingrid",
    var cpf: String = "123.459.145-88"
)

fun main() {
    val ingrid = Pessoa("Ingrid", "5555")
    println(ingrid)
}