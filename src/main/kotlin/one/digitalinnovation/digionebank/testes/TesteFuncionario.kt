package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
    val flavio = Pessoa(nome = "Flavio Neves", cpf = "123.456.789-10")
    println(flavio.nome)
    println(flavio.cpf)


    val joao = Funcionario("Flávio da Silva Neves", "123.456.789-10", BigDecimal.valueOf(2000.0))
        println(joao.nome)
        println(joao.cpf)
    println(joao.salario)
}