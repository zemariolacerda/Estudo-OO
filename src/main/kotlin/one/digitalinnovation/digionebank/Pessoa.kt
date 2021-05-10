package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "110.452.746.70"
}

fun main() {
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)
}