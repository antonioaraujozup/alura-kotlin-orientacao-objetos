package br.com.alura.bytebank.teste

fun testaCondicaoComIfElse(saldo: Double) {

    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo nulo")
    } else {
        println("Saldo negativo")
    }

}