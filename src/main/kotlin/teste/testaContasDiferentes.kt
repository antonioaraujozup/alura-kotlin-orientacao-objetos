import modelo.ContaCorrente
import modelo.ContaPoupanca
import modelo.ContaSalario

fun testaContasDiferentes() {
    // Cria modelo.Conta Poupança
    val contaPoupanca = ContaPoupanca(titular = "Eloy", numero = 1000)

    // Cria modelo.Conta Corrente
    val contaCorrente = ContaCorrente(titular = "Mai", numero = 1001)

    // Cria modelo.Conta Salario
    val contaSalario = ContaSalario(titular = "Rodolfo", numero = 1002)

    // Realiza depósito inicial nas contas criadas
    contaPoupanca.deposita(valor = 1000.0)
    contaCorrente.deposita(valor = 1000.0)
    contaSalario.deposita(valor = 1000.0)
    println("Saldo inicial da conta poupança: ${contaPoupanca.saldo}")
    println("Saldo inicial da conta corrente: ${contaCorrente.saldo}")
    println("Saldo inicial da conta salário: ${contaSalario.saldo}")

    // Realiza saque de R$100,00 nas contas criadas
    contaPoupanca.saca(valor = 100.0)
    contaCorrente.saca(valor = 100.0)
    contaSalario.saca(valor = 300.0)
    println("Saldo da conta poupança após saque de R$100,00: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após saque de R$100,00: ${contaCorrente.saldo}")
    println("Saldo da conta salário após saque de R$300,00: ${contaSalario.saldo}")

    // Transfere R$200,00 da conta poupança para a conta corrente
    contaPoupanca.transfere(valor = 200.0, destino = contaCorrente)
    println("Saldo da conta poupança após transferência de R$200,00 para conta corrente: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após receber R$200,00 da conta poupança: ${contaCorrente.saldo}")

    // Transfere R$300,00 da conta corrente para a conta poupança
    contaCorrente.transfere(valor = 300.0, destino = contaPoupanca)
    println("Saldo da conta poupança após receber R$300,00 da conta corrente: ${contaPoupanca.saldo}")
    println("Saldo da conta corrente após transferir R$300,00 para a conta poupança: ${contaCorrente.saldo}")
}