abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

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

    abstract fun saca(valor: Double)
}