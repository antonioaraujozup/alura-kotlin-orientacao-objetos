import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentos() {
    // Usa construtor primário e labels (argumento nomeados)
    val contaEloy = ContaPoupanca(titular = "Eloy", numero = 1000)
    contaEloy.deposita(200.0)

    // Usa construtor primário e labels com ordem trocada
    val contaMai = ContaCorrente(numero = 1001, titular = "Mai")
    contaMai.deposita(300.0)

    // Usa construtor secundário sem labels
    val contaRodolfo = ContaPoupanca("Rodolfo", 1010)

    println(contaEloy.titular)
    println(contaEloy.numero)
    println(contaEloy.saldo)

    println()

    println(contaMai.titular)
    println(contaMai.numero)
    println(contaMai.saldo)

    println()

    println("Depositando R$50,00 na conta do Eloy")
    contaEloy.deposita(50.0)
    println(contaEloy.saldo)

    println("Depositando R$70,00 na conta da Mai")
    contaMai.deposita(70.0)
    println(contaMai.saldo)

    println()

    println("Sacando R$250,00 da conta do Eloy")
    contaEloy.saca(250.0)
    println(contaEloy.saldo)

    println("Sacando R$100,00 da conta da Mai")
    contaMai.saca(100.0)
    println(contaMai.saldo)

    println("Tentando sacar R$500,00 da conta do Eloy")
    // Usando argumento nomeado
    contaEloy.saca(valor = 500.0)
    println(contaEloy.saldo)

    println("Tentando sacar R$500,00 da conta da Mai")
    contaMai.saca(500.0)
    println(contaMai.saldo)

    println()

    println("Transferindo R$100,00 da conta da Mai para a conta do Eloy")
    if (contaMai.transfere(100.0, contaEloy)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Falha ao tentar realizar a transferência")
    }
    println("Saldo da conta da Mai após a transferência: ${contaMai.saldo}")
    println("Saldo da conta do Eloy após a transferência: ${contaEloy.saldo}")

    println()

    println("Tentando transferir R$500,00 da conta da Mai para a conta do Eloy")
    if (contaMai.transfere(500.0, contaEloy)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Falha ao tentar realizar a transferência")
    }
    println("Saldo da conta da Mai após a tentativa de transferência: ${contaMai.saldo}")
    println("Saldo da conta do Eloy após a tentativa de transferência: ${contaEloy.saldo}")
}