open class Bird (var weight: Double, var canFly: Boolean) {

    fun makeNoise(){
        println("Animal noises.")
    }
}

class Pinguin (weight: Double) : Bird (weight, false) {

    fun waddle(){
        println("Waddle wadlle...")
    }
}

class Eagle (weight:Double): Bird (weight, true) {
    fun fly(){
        println("Fly free like an eagle!")
    }
}

class Ente (weight:Double): Bird(weight, true) {
    fun attack(){
        println("Die Ente greift dich an.")
    }
}

