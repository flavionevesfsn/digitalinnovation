package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Flavio Neves"
    var cpf: String = "123.456.789-10"
    private set
}

fun main() {

    val flavio = Pessoa()

    println(flavio)
    println(flavio.nome)
    println(flavio.cpf)

    }

