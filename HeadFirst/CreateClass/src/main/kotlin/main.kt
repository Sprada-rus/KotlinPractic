fun main(args: Array<String>) {
    val song1 = Song("Doomsday", "Architects")
    val song2 = Song("The Ivory Tower", "Adept")
    val song3 = Song("Moonlight", "Xxtenations")
    song1.play()
    song1.stop()
    song3.play()
    song1.genre = "metalcore"
    println("Жанр песни ${song1.nameSong}: ${song1.genre}")
}