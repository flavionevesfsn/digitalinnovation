package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main () {
     val joao = Analista("João da Silva Neves", "123.456.789-10", salario = 2000.0)
      TesteImprimeRelatorioFuncionario.imprime(joao)


}