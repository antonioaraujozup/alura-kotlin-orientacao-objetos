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