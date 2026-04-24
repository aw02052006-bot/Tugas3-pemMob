class Barang(
    val nama: String = "Tidak Diketahui",
    val harga: Double = 0.0,
    val jumlah: Int = 1,
    val diskon: Double = 1.0
) {
    fun tampil() {
        println("Nama Barang  : $nama")
        println("Harga Satuan : Rp $harga")
        println("Jumlah       : $jumlah")
        println("Diskon       : ${((1 - diskon) * 100).toInt()}%")
        println("Total Harga  : Rp ${hitungTotal()}")
    }

    fun hitungTotal(): Double {
        return harga * jumlah * diskon
    }
}

fun main() {
    val barang1 = Barang("Laptop", 8500000.0, 2, 0.9)
    barang1.tampil()

    println()

    val barang2 = Barang("Mouse", 150000.0, 3, 1.0)
    barang2.tampil()
}