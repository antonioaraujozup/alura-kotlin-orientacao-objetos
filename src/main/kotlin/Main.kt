fun main() {
    println("Bem-vindo ao Bytebank")
    println()

    // Usa construtor primário e labels (argumento nomeados)
    val contaEloy = Conta(titular = "Eloy", numero = 1000)
    contaEloy.deposita(200.0)

    // Usa construtor primário e labels com ordem trocada
    val contaMai = Conta(numero = 1001, titular = "Mai")
    contaMai.deposita(300.0)

    // Usa construtor secundário sem labels
    val contaRodolfo = Conta("Rodolfo", 1010, 0.0)

    println(contaEloy.titular)
    println(contaEloy.numero)
    println(contaEloy.saldo)

    println()

    println(contaMai.titular)
    println(contaMai.numero)
    println(contaMai.saldo)

    println()

    println("Depositando R$50,00 na conta do Eloy")
    contaEloy.deposita(50.0)
    println(contaEloy.saldo)

    println("Depositando R$70,00 na conta da Mai")
    contaMai.deposita(70.0)
    println(contaMai.saldo)

    println()

    println("Sacando R$250,00 da conta do Eloy")
    contaEloy.saca(250.0)
    println(contaEloy.saldo)

    println("Sacando R$100,00 da conta da Mai")
    contaMai.saca(100.0)
    println(contaMai.saldo)

    println("Tentando sacar R$500,00 da conta do Eloy")
    // Usando argumento nomeado
    contaEloy.saca(valor = 500.0)
    println(contaEloy.saldo)

    println("Tentando sacar R$500,00 da conta da Mai")
    contaMai.saca(500.0)
    println(contaMai.saldo)

    println()

    println("Transferindo R$100,00 da conta da Mai para a conta do Eloy")
    if (contaMai.transfere(100.0, contaEloy)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Falha ao tentar realizar a transferência")
    }
    println("Saldo da conta da Mai após a transferência: ${contaMai.saldo}")
    println("Saldo da conta do Eloy após a transferência: ${contaEloy.saldo}")

    println()

    println("Tentando transferir R$500,00 da conta da Mai para a conta do Eloy")
    if (contaMai.transfere(500.0, contaEloy)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Falha ao tentar realizar a transferência")
    }
    println("Saldo da conta da Mai após a tentativa de transferência: ${contaMai.saldo}")
    println("Saldo da conta do Eloy após a tentativa de transferência: ${contaEloy.saldo}")

    // cópia e referência
    //testaCopiaEReferencia()

    // if-else
    //testaCondicaoComIfElse(saldo)

    // when
    //testaCondicaoComWhen(saldo)

    // for
    //testaLoopFor()

    // for com until
    //testaLoopForComUntil()

    // for com step
    //testaLoopForComStep()

    // for com break
    //testaLoopForComBreak()

    // for com continue
    //testaLoopForComContinue()

    // for com downTo
    //testaLoopForComDownTo()

    // while
    //testaWhile()

    // do-while
    //testaDoWhile()

}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
        private set

    init {
        println("Criando conta para ${this.titular}")
    }

    constructor(titular: String, numero: Int, saldo: Double) : this(titular, numero) {
        this.saldo = saldo
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

fun testaCopiaEReferencia() {

    var numeroA = 10
    var numeroB = numeroA
    numeroB++

    println(numeroA)
    println(numeroB)

    val contaJoao = Conta("João", 1003)
    val contaMaria = Conta("Maria", 1004)

    println("titular conta joão ${contaJoao.titular}")
    println("titular conta maria ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}

fun testaCondicaoComIfElse(saldo: Double) {

    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo nulo")
    } else {
        println("Saldo negativo")
    }

}

fun testaCondicaoComWhen(saldo: Double) {

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo nulo")
        else -> println("Saldo negativo")
    }

}

fun testaLoopFor() {

    for (i in 1..5) {
        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun testaLoopForComUntil() {

    for (i in 1 until 5) {
        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun testaLoopForComStep() {

    for (i in 1..5 step 2) {
        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun testaLoopForComBreak() {

    for (i in 1..5) {

        if (i == 4) {
            break
        }

        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun testaLoopForComContinue() {

    for (i in 1..5) {

        if (i == 4) {
            continue
        }

        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun testaLoopForComDownTo() {

    for (i in 5 downTo 1) {
        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

}

fun testaWhile() {

    var i = 1

    while (i <= 5) {

        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()

        i++

    }

}

fun testaDoWhile() {

    var i = 1

    do {

        val titular: String = "Eloy $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 0.0 + i

        println("Titular: $titular")
        println("Número: $numeroConta")
        println("Saldo: $saldo")
        println()

        i++

    } while (i <= 5)

}
