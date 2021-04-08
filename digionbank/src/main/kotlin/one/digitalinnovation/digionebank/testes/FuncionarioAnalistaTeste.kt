package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelarioFuncionario

fun main() {
    val joao = Analista("Joao", "5456465", 1000.0)
    ImprimeRelarioFuncionario.imprime(joao)
}

