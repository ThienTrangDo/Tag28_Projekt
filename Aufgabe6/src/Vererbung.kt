open class Haustier(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun pet(){
        println("Dein Haustier hat sich streicheln lassen.")
    }
}

class Meerschweinchen(name: String, age: Int, val jumpheight: Int) : Haustier(name, age) {

    fun jump(heightSleepPlace: Int): Boolean {
        return heightSleepPlace <= jumpheight
    }
}

fun main (){
    var kruemel: Meerschweinchen = Meerschweinchen("Kruemel", 3, 25)
    kruemel.pet()
    println("Dein Haustier heisst " + kruemel.name + " und ist " + kruemel.age + " Jahre alt.")
    println(kruemel.jump(30))
}

/*
Output:
Dein Haustier hat sich streicheln lassen.
Dein Haustier heisst Kruemel und ist 3 Jahre alt.
false

pet() Methode wurde geerbt von der Klasse Haustier, deswegen kann man mit der Klasse
Meerschweinchen auch drauf zugreifen.

name und age können wir mit Meerschweinchen Instanz zugreifen, weil diese geerbt ist von
Haustier Klasse

open, damit öffnet man eine Klasse und kann diese vererben

Haustier(name, age), es wird eine klasse geöffnet mit den grundbausteinen von der Klasse Haustier

 */