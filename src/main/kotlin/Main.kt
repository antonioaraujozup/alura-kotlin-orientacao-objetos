fun main() {

    println("Bem-vindo ao Bytebank")

    // Cria Conta Poupança
    val contaPoupanca = ContaPoupanca(titular = "Eloy", numero = 1000)

    // Cria Conta Corrente
    val contaCorrente = ContaCorrente(titular = "Mai", numero = 1001)

    // Realiza depósito inicial nas contas criadas
    contaPoupanca.deposita(valor = 1000.0)
    contaCorrente.deposita(valor = 1000.0)
    println("Saldo inicial da conta poupança: ${contaPoupanca.saldo}")
    println("Saldo inicial da conta corrente: ${contaCorrente.saldo}")

    // Realiza saque de R$100,00 nas contas criadas
    contaPoupanca.saca(valor = 100.0)
    contaCorrente.saca(valor = 100.0)
    println("Saldo da conta poupança após saque de R$100,00: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após saque de R$100,00: ${contaCorrente.saldo}")

    // Transfere R$200,00 da conta poupança para a conta corrente
    contaPoupanca.transfere(valor = 200.0, destino = contaCorrente)
    println("Saldo da conta poupança após transferência de R$200,00 para conta corrente: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após receber R$200,00 da conta poupança: ${contaCorrente.saldo}")

    // Transfere R$300,00 da conta corrente para a conta poupança
    contaCorrente.transfere(valor = 300.0, destino = contaPoupanca)
    println("Saldo da conta poupança após receber R$300,00 da conta corrente: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após transferir R$300,00 para a conta poupança: ${contaCorrente.saldo}")


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

//    // Testa Funcionários
//    testaFuncionarios()


}

