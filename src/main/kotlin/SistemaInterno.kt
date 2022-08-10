class SistemaInterno {
    fun entra(funcionarioAdmin: FuncionarioAdmin, senha: Int) {
        if (funcionarioAdmin.autentica(senha)) {
            println("Bem-vindo ao Bytebank, ${funcionarioAdmin.nome}")
        } else {
            println("Falha ao autenticar")
        }
    }
}