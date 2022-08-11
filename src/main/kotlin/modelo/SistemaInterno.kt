package modelo

import modelo.Autenticavel

class SistemaInterno {
    fun entra(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
        } else {
            println("Falha ao autenticar")
        }
    }
}