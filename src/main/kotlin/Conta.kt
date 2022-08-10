open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set

    init {
        println("Criando conta para ${this.titular}")
    }

    constructor(titular: String, numero: Int, saldo: Double) : this(titular, numero) {
        this.saldo = saldo
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}