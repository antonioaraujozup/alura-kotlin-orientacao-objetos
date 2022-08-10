abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val bonificacao: Double = this.salario * 0.1
}