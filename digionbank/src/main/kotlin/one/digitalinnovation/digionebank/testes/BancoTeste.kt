package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    //argumentos nomeados
    val digiOneBank = Banco(nome = "Digital One", numero = 420)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco 2")
    println(banco2.info())
}