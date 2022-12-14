package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

    companion object {
        var total: Int = 0
            private set
    }

    init {
        println("Criando conta para ${this.titular.nome}")
        total++
    }

    constructor(titular: Cliente, numero: Int, saldo: Double) : this(titular, numero) {
        this.saldo = saldo
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}