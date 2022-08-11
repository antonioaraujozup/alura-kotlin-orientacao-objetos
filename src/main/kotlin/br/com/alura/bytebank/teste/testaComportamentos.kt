package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentos() {
    // Usa construtor primário e labels (argumento nomeados)
    val eloy = Cliente(nome = "Eloy", cpf = "123.456.789-00", senha = 1)
    val contaEloy = ContaPoupanca(titular = eloy, numero = 1000)
    contaEloy.deposita(200.0)

    // Usa construtor primário e labels com ordem trocada
    val mai = Cliente(nome = "Mai", cpf = "111.111.111-11", senha = 2)
    val contaMai = ContaCorrente(numero = 1001, titular = mai)
    contaMai.deposita(300.0)

    // Usa construtor secundário sem labels
    val rodolfo = Cliente(
        nome = "Rodolfo",
        cpf = "222.222.222-22",
        senha = 3,
        endereco = Endereco(logradouro = "Avenida 33")
    )
    val contaRodolfo = ContaPoupanca(rodolfo, 1010)
    contaRodolfo.deposita(500.0)

    println(contaEloy.titular.nome)
    println(contaEloy.titular.endereco.logradouro)
    println(contaEloy.titular.endereco.numero)
    println(contaEloy.numero)
    println(contaEloy.saldo)

    println()

    println(contaMai.titular.nome)
    contaMai.titular.endereco.logradouro = "Avenida 2"
    println(contaMai.titular.endereco.logradouro)
    println(contaMai.titular.endereco.numero)
    println(contaMai.numero)
    println(contaMai.saldo)

    println()

    println(contaRodolfo.titular.nome)
    println(contaRodolfo.titular.endereco.logradouro)
    println(contaRodolfo.titular.endereco.numero)
    println(contaRodolfo.numero)
    println(contaRodolfo.saldo)

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