class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorSaqueComTaxa = valor + 0.1
        if(this.saldo >= valorSaqueComTaxa) {
            this.saldo -= valorSaqueComTaxa
        }
    }
}