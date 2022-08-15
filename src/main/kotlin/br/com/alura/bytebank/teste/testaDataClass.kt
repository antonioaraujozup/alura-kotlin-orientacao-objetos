package br.com.alura.bytebank.teste

fun testaDataClass() {

    val eloy = Pessoa(nome = "Eloy", idade = 33)
    val maiana = Pessoa(nome = "Maiana", idade = 32)
    val eloy2 = eloy
    val eloy3 = Pessoa(nome = "Eloy", idade = 33)

    // == é igual a equals()
    /// === compara a referência
    println("Eloy é igual a Maiana: ${eloy == maiana}")
    println("Eloy é igual a Eloy2: ${eloy == eloy2}")
    println("Eloy é igual a Eloy3: ${eloy == eloy3}")

    val docEloy = Documento(rg = "123", cpf = "123")
    val docMai = Documento(rg = "456", cpf = "456")
    val docEloy2 = docEloy
    val docEloy3 = Documento(rg = "123", cpf = "123")

    // == é igual a equals()
    /// === compara a referência
    println("DocEloy é igual a DocMai: ${docEloy == docMai}")
    println("DocEloy é igual a DocEloy2: ${docEloy == docEloy2}")
    println("DocEloy é igual a DocEloy3: ${docEloy == docEloy3}")
    println("Imprimindo DocEloy: $docEloy")

    // Testando Destructuring Declarations
    val (nome, idade) = docEloy
    println("Nome: $nome, Idade: $idade")

    // Testando Copy()
    val docEloy4 = docEloy.copy()
    println("Imprimindo DocEloy4: $docEloy4")

}

class Pessoa(val nome: String, val idade: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (nome != other.nome) return false
        if (idade != other.idade) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + idade
        return result
    }
}

data class Documento(val rg: String, val cpf: String)