package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelarioFuncionario

fun main() {
    val maria = Gerente("Maria", "545456", 5000.0)
    ImprimeRelarioFuncionario.imprime(maria)
}
