fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    val vet = Vet()

    for (item in animals){
        item.roam()
        item.eat()
    }

    for (item in animals){
        vet.giveShot(item)
    }
}