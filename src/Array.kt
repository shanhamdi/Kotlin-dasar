fun main() {
//    satu array tipe datanya harus sama tidak bisa berbeda
//    array tidak boleh null


    val name: Array<String>  = arrayOf("shan","ikhsanul")
    val number: Array<Int> = arrayOf(1,2,3)

//memanggil isi array dengan cara masukan index yang mulai dari 0
    println(name[0])

//    mengubah isi array
        name.set(0,"jaka")

//Array Nullable
    val members: Array<String?> = arrayOfNulls(3)
    members[0]="jaka"
    members[1]="jakas"
    members[2]="jakad"
    println(members)
}
