package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjectExpression() {
    val eloy = object: Autenticavel {
        val titular: String = "Eloy"
        val cpf: String = "123.456.789-00"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(autenticavel = eloy, senha = 1000)
    sistemaInterno.entra(autenticavel = eloy, senha = 1001)

}