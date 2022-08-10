fun testaFuncionarios() {
    // Cria um Funcionário
    val eloy = Funcionario(
        nome = "Eloy",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${eloy.nome}")
    println("CPF: ${eloy.cpf}")
    println("Salário: ${eloy.salario}")
    println("Bonificação: ${eloy.bonificacao}")

    // Cria um Analista
    val joao = Analista(
        nome = "João",
        cpf = "123.123.123-11",
        salario = 1500.0
    )

    println("Nome: ${joao.nome}")
    println("CPF: ${joao.cpf}")
    println("Salário: ${joao.salario}")
    println("Bonificação: ${joao.bonificacao}")

    // Cria um Gerente
    val mai = Gerente(
        nome = "Mai",
        cpf = "123.456.789-00",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${mai.nome}")
    println("CPF: ${mai.cpf}")
    println("Salário: ${mai.salario}")
    println("Bonificação: ${mai.bonificacao}")

    when (mai.autentica(senha = 1234)) {
        true -> println("Gerente autenticado com sucesso")
        false -> println("Falha na autenticação")
    }

    // Cria um Diretor
    val rodolfo = Diretor(
        nome = "Rodolfo",
        cpf = "000.000.000-00",
        salario = 5000.0,
        senha = 4321,
        plr = 1000.0
    )

    println("Nome: ${rodolfo.nome}")
    println("CPF: ${rodolfo.cpf}")
    println("Salário: ${rodolfo.salario}")
    println("Bonificação: ${rodolfo.bonificacao}")
    println("PLR: ${rodolfo.plr}")

    when (rodolfo.autentica(senha = 4321)) {
        true -> println("Diretor autenticado com sucesso")
        false -> println("Falha na autenticação")
    }

    // Calculando total de bonificação dos funcionários
    val calculadoraBonificacao = CalculadoraBonificacao()

    calculadoraBonificacao.registra(eloy)
    calculadoraBonificacao.registra(mai)
    calculadoraBonificacao.registra(rodolfo)
    calculadoraBonificacao.registra(joao)

    println("Total de bonificação: ${calculadoraBonificacao.total}")
}