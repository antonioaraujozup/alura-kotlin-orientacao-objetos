package br.com.alura.bytebank.modelo

class SistemaInterno {
    fun entra(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
        } else {
            println("Falha ao autenticar")
        }

        when(autenticavel) {
            is FuncionarioAdmin -> println("Opções de um funcionário admin para ${autenticavel.nome}")
            is Cliente -> println("Opções de um cliente para ${autenticavel.nome}")
            else -> println("Outras opções")
        }

    }
}