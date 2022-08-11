package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ClasseConstrutorDefault
import br.com.alura.bytebank.modelo.ClasseConstrutorPrimario
import br.com.alura.bytebank.modelo.ClasseConstrutorSecundario

fun testaClassesComDiferentesConstrutores() {
    val classeConstrutorDefault = ClasseConstrutorDefault()
    println(classeConstrutorDefault.nome)
    println(classeConstrutorDefault.idade)

    // Testa classe com construtor primário
    val classeConstrutorPrimario = ClasseConstrutorPrimario(nome = "Eloy", idade = 33)
    println(classeConstrutorPrimario.nome)
    println(classeConstrutorPrimario.idade)

    // Testa classe com construtor secundário
    val classeConstrutorSecundario = ClasseConstrutorSecundario(nome = "Mai", idade = 32)
    println(classeConstrutorSecundario.nome)
    println(classeConstrutorSecundario.idade)
}