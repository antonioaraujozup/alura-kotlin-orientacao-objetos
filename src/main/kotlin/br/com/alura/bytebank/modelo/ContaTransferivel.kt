package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
){
    fun transfere(valor: Double, destino: ContaTransferivel): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}