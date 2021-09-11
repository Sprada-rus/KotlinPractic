fun main(args: Array<String>) {
    //Create three arrays
    val array1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val array2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val array3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    //Create args with size arrays
    val arraySize1 = array1.size
    val arraySize2 = array2.size
    val arraySize3 = array3.size

    //Create args with random num of args size
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    println("${array1[rand1]} ${array2[rand2]} ${array3[rand3]}")
}