class Wolf : Canine() {
    override val image = "wolf.img"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}