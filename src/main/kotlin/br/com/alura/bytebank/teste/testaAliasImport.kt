package br.com.alura.bytebank.teste

fun testaAliasImport() {
    val stringDaLinguagemKotlin: String = "String do Kotlin"
    val stringDaLinguagemJava: java.lang.String = java.lang.String("String do Java")
    println(stringDaLinguagemKotlin)
    println(stringDaLinguagemJava)
}