package sinngjpeg.collections

fun main() {

    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("---------- LIST -----------")

    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach {
        println(it)
    }

    println("---------- LIST -----------")

    funcionarios.add(pedro)
    funcionarios.remove(joao)

    funcionarios.forEach {
        println(it)
    }

    println("---------- SET -----------")

    //conjunto mutavel
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach {
        println(it)
    }

    println("---------- SET -----------")

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)

    funcionarioSet.forEach {
        println(it)
    }

    println("---------- SET -----------")

    funcionarioSet.remove(maria)

    funcionarioSet.forEach {
        println(it)
    }
}