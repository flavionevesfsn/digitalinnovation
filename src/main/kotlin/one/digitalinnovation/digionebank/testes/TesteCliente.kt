package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main() {
   val jose = Cliente(
      nome = "José da Silva",
      cpf = "123.456.789-52",
      clienteTipo = ClienteTipo.PF,
      senha = "1235456"

   )
    println(jose)

    TesteAutenticacao().autentica(jose)
}