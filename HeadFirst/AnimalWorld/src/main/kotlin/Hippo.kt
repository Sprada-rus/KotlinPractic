class Hippo : Animal() {
    override val image = "hippo.img"
    override val food = "grass"
    override val habitat = "water"

    final override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    final override fun eat() {
        println("The Hippo is eating $food")
    }

}