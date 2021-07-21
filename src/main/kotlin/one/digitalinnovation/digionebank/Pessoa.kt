package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Flavio Neves"
    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {

    val flavio = Pessoa()
    println(flavio.pessoaInfo())


    }

