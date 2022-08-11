package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaEReferencia() {

    var numeroA = 10
    var numeroB = numeroA
    numeroB++

    println(numeroA)
    println(numeroB)

    val contaJoao = ContaPoupanca(
        Cliente(nome = "João", cpf = "123.456.789-00", senha = 1),
        1003
    )
    val contaMaria = ContaCorrente(
        Cliente(nome = "Maria", cpf = "111.111.111-11", senha = 2),
        1004
    )

    println("titular conta joão ${contaJoao.titular.nome}")
    println("titular conta maria ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)

}