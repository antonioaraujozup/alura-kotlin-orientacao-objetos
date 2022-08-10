class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double = super.bonificacao + this.salario * 0.1
}