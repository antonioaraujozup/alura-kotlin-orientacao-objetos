package br.com.alura.bytebank.teste

fun testaObjectExpression() {
    var eloy = object {
        val titular: String = "Eloy"
        val cpf: String = "123.456.789-00"
        val senha: Int = 1000

        fun autentica(senha: Int) = this.senha == senha
    }

    println("Autentica com sucesso: ${eloy.autentica(senha = 1000)}")
    println("Falha na autenticação: ${eloy.autentica(senha = 1001)}")
}