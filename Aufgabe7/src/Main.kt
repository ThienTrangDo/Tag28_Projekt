fun main (){
    var pinguin: Pinguin = Pinguin(2500.0)
    println(pinguin.canFly)
    pinguin.makeNoise()
    pinguin.waddle()

    println()

    var eagle: Eagle = Eagle(4700.0)
    println(eagle.canFly)
    eagle.makeNoise()
    eagle.fly()

    println()

    var ente = Ente (740.0)
    println(ente.canFly)
    ente.attack()
}