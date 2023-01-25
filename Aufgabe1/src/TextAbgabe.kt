
class Car {
  var color: String
  var speed: Int

  constructor(color: String, speed: Int) {
    this.color = color
    this.speed = speed
  }

  fun paint(color: String) {
    this.color = color
  }

  fun tune() {
    speed = speed + 10
  }
}
/*
Es wurde eine Klasse erstellt namens Car, mit 2 Eigenschaften color und speed.
In der Klasse gibt es ein sekundären Konstruktor und 2 Methoden paint und tune.
Die Funktion paint überschreibt die variable color
Die Funktion tune erhöht den Speed Wert um 10

Ein Objekt-Instanz wurde erzeugt (var car: Car = Car("weiss", 150) ein weißes Auto mit 150 ps
Danach wird das Auto gefärbt von weiß zu schwarz und aufgetunt 150 ps auf 160 ps

Output:
schwarz
160

 */

fun main (){
    var car: Car = Car("weiss", 150)

    car.paint("schwarz")
    car.tune()

    println(car.color)
    println(car.speed)
}

