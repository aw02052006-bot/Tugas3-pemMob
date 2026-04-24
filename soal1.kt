
fun hitungJarak(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
}

fun main() {
    val jarak1 = hitungJarak(2.0, 3.0, 8.0, 7.0)
    println("Jarak t1(2,3) dan t2(8,7) = ${"%.4f".format(jarak1)}")

    val jarak2 = hitungJarak(5.0, 3.0, -8.0, -4.0)
    println("Jarak t1(5,3) dan t2(-8,-4) = ${"%.4f".format(jarak2)}")
}