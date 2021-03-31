fun main() {

//    integer
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L  //Tambahkan L di belakang menandakan type data Long

    println(age)
    println(height)
    println(distance)
    println(balance)

//    Floating Point
    var sample: Float = 10.11F //Harus menggunakan F unutk menandakan Float
    var sample2: Double= 232.33

    println(sample)
    println(sample2)

//    literals

    var decimalLiterals: Int =100
    var hexaLiterals: Int= 0xFF
    var binaryLiterals: Int= 0b0001

    println(decimalLiterals)
    println(hexaLiterals)
    println(binaryLiterals)

//    Underscore supaya enak dibaca
    var ageUn: Byte = 3_0
    var heightUn: Int = 1_70
    var distanceUn: Short = 2_000
    var balanceUn: Long = 100_000_000L
    println(ageUn)
    println(heightUn)

//    Convert
    var  number: Int=100

    var  byte:Byte = number.toByte()
    var shortShort = number.toShort()
    var int:Int = number.toInt()
    var long: Long = number.toLong()
    var double:Double = number.toDouble()
    var float: Float = number.toFloat()

    println(byte)

}