package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main () {
     val Julia = Gerente("Julia Maria", "123.456.789-20", 5000.0, "123456")
    TesteImprimeRelatorioFuncionario.imprime(Julia)

    TesteAutenticacao().autentica(Julia)
}