package br.com.alura.bytebank.teste

fun testaClasseNumber() {

    val x: Int = 10
    val y: Double = 15.0

    imprimeNumber(x)
    imprimeNumber(y)

    println("Convertendo de Int para Double: ${x.toDouble()}")
    println("Convertendo de Double para Int: ${y.toInt()}")

}