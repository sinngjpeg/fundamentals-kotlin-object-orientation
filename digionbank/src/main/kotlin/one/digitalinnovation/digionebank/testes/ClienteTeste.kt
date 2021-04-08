package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.455.478-88",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)
    AutenticacaoTeste().autentica(jose)
}