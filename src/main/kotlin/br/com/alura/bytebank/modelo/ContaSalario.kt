package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaSalario : Conta {

    constructor(titular: Cliente, numero: Int): super(titular = titular, numero = numero)

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}
