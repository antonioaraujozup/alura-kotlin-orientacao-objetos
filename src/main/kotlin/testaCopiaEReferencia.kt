fun testaCopiaEReferencia() {

    var numeroA = 10
    var numeroB = numeroA
    numeroB++

    println(numeroA)
    println(numeroB)

    val contaJoao = ContaPoupanca("João", 1003)
    val contaMaria = ContaCorrente("Maria", 1004)

    println("titular conta joão ${contaJoao.titular}")
    println("titular conta maria ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}