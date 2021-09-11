fun main() {
    var x = 1
    val y = 5
    println("Before the loop. x = $x and y = $y")
    while (x < 4){
        println("In the loop. x = $x")
        x++
    }
    println("The end loop. x = $x")

    println(if (x < y) "x still not greater than y" else "x is greater than y")
}