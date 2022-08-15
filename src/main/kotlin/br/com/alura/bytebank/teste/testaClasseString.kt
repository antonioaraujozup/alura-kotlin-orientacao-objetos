package br.com.alura.bytebank.teste

fun testaClasseString() {

    val palavra: String = "palavra";
    var palavraNova: String = palavra

    println(palavra)
    println(palavraNova)

    palavraNova = "palavraNova"

    // String é imutável
    println(palavra)
    println(palavraNova)

    // Imprime cada letra da palavra
    for(c in palavra) {
        println(c)
    }

    // Obtém substring
    var palavraSubString: String = palavra.substring(4)
    println(palavraSubString)
}