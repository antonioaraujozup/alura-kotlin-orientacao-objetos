fun main() {

    println("Bem-vindo ao Bytebank")

//    // Construtores, propriedades e métodos/comportamentos
//    testaComportamentos()
//
//    // cópia e referência
//    testaCopiaEReferencia()
//
//    // if-else
//    testaCondicaoComIfElse(saldo = 100.0)
//
//    // when
//    testaCondicaoComWhen(saldo = 100.0)
//
//    // for
//    testaLoopFor()
//
//    // for com until
//    testaLoopForComUntil()
//
//    // for com step
//    testaLoopForComStep()
//
//    // for com break
//    testaLoopForComBreak()
//
//    // for com continue
//    testaLoopForComContinue()
//
//    // for com downTo
//    testaLoopForComDownTo()
//
//    // while
//    testaWhile()
//
//    // do-while
//    testaDoWhile()

    // Cria um Funcionário
    val eloy = Funcionario(
        nome = "Eloy",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${eloy.nome}")
    println("CPF: ${eloy.cpf}")
    println("Salário: ${eloy.salario}")
    println("Bonificação: ${eloy.bonificacao()}")

}