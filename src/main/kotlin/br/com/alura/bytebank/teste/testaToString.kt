package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaToString() {
    val enderecoCasa = Endereco(logradouro = "Rua João Maria", numero = 100)
    val enderecoTrabalho = Endereco(bairro = "Itaparica", estado = "ES")

    println(enderecoCasa)
    println(enderecoTrabalho)
}