package br.com.alura.bytebank.teste

fun testaDoWhile() {

    var i = 1

    do {

        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()

        i++

    } while (i <= 5)

}