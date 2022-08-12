package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    fun registraComAnyECast(funcionario: Any) {
        funcionario as Funcionario
        this.total += funcionario.bonificacao
    }

    fun registraComAnyESmartCast(funcionario: Funcionario) {
        if(funcionario is Funcionario) this.total += funcionario.bonificacao
    }
}