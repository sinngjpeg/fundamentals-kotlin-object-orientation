package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ingrid"
    var cpf: String = "123.459.145-88"
}

fun main() {
    val ingrid = Pessoa()
    println(ingrid.nome)
    println(ingrid.cpf)
}