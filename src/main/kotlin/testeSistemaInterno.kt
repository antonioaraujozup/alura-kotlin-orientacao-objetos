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

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(funcionarioAdmin = gerente, senha = 123)
    sistemaInterno.entra(funcionarioAdmin = diretora, senha = 4567)
}