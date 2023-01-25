class Airplane {
    var amountTurbines: Int
    var flyingSpeed: Double
    var isAirborne: Boolean

    constructor(amountTurbines: Int, flyingSpeed: Double, isAirborne: Boolean){
        this.amountTurbines = amountTurbines
        this.flyingSpeed = flyingSpeed
        this.isAirborne = isAirborne
    }

    fun takeOff() {
        if (isAirborne == false){
           isAirborne = true
            return takeOff()
        } else {
            println("Fehler")}
    }

    fun land(){
       if (isAirborne == true){
           isAirborne = false
           return land()
       }
    }
}

fun main (){
    var flugzeug = Airplane (2, 1000.0, false)
    println(flugzeug.isAirborne)
    flugzeug.takeOff()
    println(flugzeug.isAirborne)
    println(flugzeug.takeOff())
}