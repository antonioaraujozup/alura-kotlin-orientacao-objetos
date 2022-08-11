package br.com.alura.bytebank.modelo

class Endereco(
    var logradouro: String = "Rua",
    var numero: Int = 1,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
) {
}