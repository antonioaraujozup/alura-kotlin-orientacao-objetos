package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testeSistemaInterno() {
    val gerente = Gerente(
        nome = "Eloy",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 123
    )

    val diretora = Diretor(
        nome = "Mai",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 456,
        plr = 5000.0
    )

    val cliente = Cliente(
        nome = "Rodolfo",
        cpf = "000.000.000-00",
        senha = 789
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(autenticavel = gerente, senha = 123)
    sistemaInterno.entra(autenticavel = diretora, senha = 456)
    sistemaInterno.entra(autenticavel = cliente, senha = 789)
}