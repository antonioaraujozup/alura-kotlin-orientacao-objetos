package br.com.alura.bytebank.teste

fun testaCondicaoComWhen(saldo: Double) {

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo nulo")
        else -> println("Saldo negativo")
    }

}