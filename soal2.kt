inline fun pangkat(basis: Int, eksponen: Int): Double {
    return basis.toDouble().pow(eksponen)
}

fun main() {
    println("4 pangkat 3 = ${pangkat(4, 3).toInt()}")
}