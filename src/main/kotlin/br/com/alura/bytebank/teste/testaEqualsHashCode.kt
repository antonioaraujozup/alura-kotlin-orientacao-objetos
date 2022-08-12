package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaEqualsHashCode() {
    val endereco = Endereco(cep = "00000-000")
    val enderecoNovo = Endereco(cep = "00000-000")

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
}