package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Flavio Neves"
    var cpf: String = "123.456.789-10"

    inner class Endereco {
        var rua: String = "Rua teste"
    }
}

fun main() {

    val flavio = Pessoa()

    println(flavio.nome)
    println(flavio.cpf)

    }

