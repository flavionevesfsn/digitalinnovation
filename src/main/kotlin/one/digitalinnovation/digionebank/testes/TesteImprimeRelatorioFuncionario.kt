package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

class TesteImprimeRelatorioFuncionario(Julia: Gerente) {
    companion object {
        fun imprime (funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}