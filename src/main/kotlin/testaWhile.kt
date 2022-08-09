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