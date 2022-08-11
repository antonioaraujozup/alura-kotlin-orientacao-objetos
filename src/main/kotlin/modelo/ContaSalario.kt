package modelo

import modelo.Conta

class ContaSalario : Conta {

    constructor(titular: String, numero: Int): super(titular = titular, numero = numero)

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}
