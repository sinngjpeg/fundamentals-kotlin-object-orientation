package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Funcionario("Joao", "5456465", BigDecimal.valueOf(200.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}